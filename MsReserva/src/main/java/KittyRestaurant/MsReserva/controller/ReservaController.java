package KittyRestaurant.MsReserva.controller;

import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.dto.ReservaResponse;
import KittyRestaurant.MsReserva.dto.ResponseFormat;
import KittyRestaurant.MsReserva.mapper.ReservaMapper;
import KittyRestaurant.MsReserva.model.ReservaModel;
import KittyRestaurant.MsReserva.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @Autowired
    ReservaService reservaService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    @GetMapping("/getAll")
    public ResponseEntity<ResponseFormat> getAll() {
        
        try {
            ReservaResponse res = new ReservaResponse();
            List<ReservaDTO> reservas = ReservaMapper.INSTANCE.ListModelToListDto(reservaService.getAll());
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(reservas));
            if(reservas.size() == 0){
                throw new Exception();
            }
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("peticion correcta");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse res = new ReservaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("204");
            res.setMessage("No hay reservas");
            return new ResponseEntity<>(res,HttpStatus.NO_CONTENT);
        }
        
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public ResponseEntity<ResponseFormat> getById(@PathVariable int id){
        
        try {
            ReservaResponse res = new ReservaResponse();
            ReservaDTO reserva = reservaService.getById(id).map(
            ReservaModel -> ReservaMapper.INSTANCE.ModelToDto(ReservaModel)
            ).orElseThrow();
            if(reserva == null){
            throw new Exception();
            }
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(reserva));
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("peticion correcta");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse res = new ReservaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("400");
            res.setMessage(e.getMessage());
            return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
        }
        
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseFormat> create(@RequestBody ReservaRequest req){
        try {
            ReservaResponse res = new ReservaResponse();
            ReservaModel model = ReservaMapper.INSTANCE.RequestToModel(req);
            ReservaDTO reserva = ReservaMapper.INSTANCE.ModelToDto(reservaService.create(model));
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(reserva));
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("peticion correcta");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse res = new ReservaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("500");
            res.setMessage("Ocurrio un al error al registrar");
            return new ResponseEntity<>(res,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseFormat> update(@RequestBody ReservaRequest req){
        try {
            ReservaResponse res = new ReservaResponse();
            ReservaModel model = ReservaMapper.INSTANCE.RequestToModel(req);
            ReservaDTO reserva = ReservaMapper.INSTANCE.ModelToDto(reservaService.update(model));
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(reserva));
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("peticion correcta");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse res = new ReservaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("500");
            res.setMessage("Ocurrio un al error al actualizar");
            return new ResponseEntity<>(res,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseFormat> delete(@PathVariable int id) {
        
        try {
            ReservaResponse res = new ReservaResponse();
            ReservaDTO eliminar = reservaService.delete(id).map(
                ReservaModel -> ReservaMapper.INSTANCE.ModelToDto(ReservaModel)
            ).orElseThrow();
            if(eliminar==null){
                throw new Exception();
            }
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(eliminar));
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("eliminado correctamente");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse res = new ReservaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("400");
            res.setMessage("error al eliminar");
            return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
        }
        
    }
}
