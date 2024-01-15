package KittyRestaurant.MsReserva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import KittyRestaurant.MsReserva.dto.MesaDTO;
import KittyRestaurant.MsReserva.dto.MesaRequest;
import KittyRestaurant.MsReserva.dto.MesaResponse;
import KittyRestaurant.MsReserva.dto.ResponseFormat;
import KittyRestaurant.MsReserva.mapper.MesaMapper;
import KittyRestaurant.MsReserva.model.MesaModel;
import KittyRestaurant.MsReserva.service.MesaService;

@RestController
@RequestMapping("/api/mesa")
public class MesaController {

    @Autowired
    MesaService mesaService;
    ObjectMapper objectMapper = new ObjectMapper();

    
    @PostMapping("/create")
    public ResponseEntity<ResponseFormat> create(@RequestBody MesaRequest req){
        try {
            MesaResponse mes = new MesaResponse();
            MesaModel model = MesaMapper.INSTANCE.RequestToModel(req);
            MesaDTO mesa = MesaMapper.INSTANCE.ModelToDto(mesaService.create(model));
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(mesa));
            mes.setStatus(true);
            mes.setHttpStatusCode("200");
            mes.setMessage("Se creo una mesa nueva");
            mes.setData(data);
            return new ResponseEntity<>(mes,HttpStatus.OK);
        } catch (Exception e) {
            MesaResponse res = new MesaResponse();
            res.setStatus(false);
            res.setHttpStatusCode("500");
            res.setMessage("Ocurrio un al error al registrar mesa");
            return new ResponseEntity<>(res,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @GetMapping("/getById/{id}")
    @ResponseBody
    public ResponseEntity<ResponseFormat> getById(@PathVariable int id){
        
        try {
            MesaResponse mes = new MesaResponse();
            MesaDTO mesa = mesaService.getById(id).map(
            MesaModel -> MesaMapper.INSTANCE.ModelToDto(MesaModel)
            ).orElseThrow();
            if(mesa == null){
            throw new Exception();
            }
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(mesa));
            mes.setStatus(true);
            mes.setHttpStatusCode("200");
            mes.setMessage("peticion correcta");
            mes.setData(data);
            return new ResponseEntity<>(mes,HttpStatus.OK);
        } catch (Exception e) {
            MesaResponse mes = new MesaResponse();
            mes.setStatus(false);
            mes.setHttpStatusCode("400");
            mes.setMessage(e.getMessage());
            return new ResponseEntity<>(mes,HttpStatus.BAD_REQUEST);
        }
        
    }

    @GetMapping("/findAll")
    public ResponseEntity<ResponseFormat> findAll() {
        
        try {
            MesaResponse mes = new MesaResponse();
            List<MesaDTO> mesas = MesaMapper.INSTANCE.ListModelToListDto(mesaService.findAll());
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(mesas));
            if(mesas.size() == 0){
                throw new Exception();
            }
            mes.setStatus(true);
            mes.setHttpStatusCode("200");
            mes.setMessage("peticion correcta");
            mes.setData(data);
            return new ResponseEntity<>(mes,HttpStatus.OK);
        } catch (Exception e) {
            MesaResponse mes = new MesaResponse();
            mes.setStatus(false);
            mes.setHttpStatusCode("204");
            mes.setMessage("No hay mesas");
            return new ResponseEntity<>(mes,HttpStatus.NO_CONTENT);
        }
        
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseFormat> delete(@PathVariable int id) {
        
        try {
            MesaResponse mes = new MesaResponse();
            MesaDTO eliminar = mesaService.deleteById(id).map(
                MesaModel ->MesaMapper.INSTANCE.ModelToDto(MesaModel)
            ).orElseThrow();
            if(eliminar==null){
                throw new Exception();
            }
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(eliminar));
            mes.setStatus(true);
            mes.setHttpStatusCode("200");
            mes.setMessage("eliminado correctamente");
            mes.setData(data);
            return new ResponseEntity<>(mes,HttpStatus.OK);
        } catch (Exception e) {
            MesaResponse mes = new MesaResponse();
            mes.setStatus(false);
            mes.setHttpStatusCode("400");
            mes.setMessage("error al eliminar mesa");
            return new ResponseEntity<>(mes,HttpStatus.BAD_REQUEST);
        }
        
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseFormat> update(@RequestBody MesaRequest req){
        try {
            MesaResponse mes = new MesaResponse();
            MesaModel model = MesaMapper.INSTANCE.RequestToModel(req);
            MesaDTO mesa = MesaMapper.INSTANCE.ModelToDto(mesaService.update(model));
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(mesa));
            mes.setStatus(true);
            mes.setHttpStatusCode("200");
            mes.setMessage("peticion correcta");
            mes.setData(data);
            return new ResponseEntity<>(mes,HttpStatus.OK);
        } catch (Exception e) {
            MesaResponse mes = new MesaResponse();
            mes.setStatus(false);
            mes.setHttpStatusCode("500");
            mes.setMessage("Ocurrio un al error al actualizar mesa");
            return new ResponseEntity<>(mes,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }




    
}
