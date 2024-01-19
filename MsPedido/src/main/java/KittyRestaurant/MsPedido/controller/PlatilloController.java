package KittyRestaurant.MsPedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import KittyRestaurant.MsPedido.dto.PlatilloDTO;
import KittyRestaurant.MsPedido.dto.PlatilloRequest;
import KittyRestaurant.MsPedido.dto.PlatilloResponse;
import KittyRestaurant.MsPedido.dto.ResponseFormat;
import KittyRestaurant.MsPedido.mapper.PlatilloMapper;
import KittyRestaurant.MsPedido.model.PlatilloModel;
import KittyRestaurant.MsPedido.service.PlatilloService;

@RestController
@RequestMapping("/api/platillo")
public class PlatilloController {
    
    @Autowired 
    PlatilloService platilloService;
    ObjectMapper objectMapper = new ObjectMapper();
    

    @GetMapping("/getAll")
    public ResponseEntity<ResponseFormat> getAll() {
        
        try {
            PlatilloResponse res = new PlatilloResponse();
            List<PlatilloDTO> reservas = PlatilloMapper.INSTANCE.ListModelToListDto(platilloService.getAll());
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
            PlatilloResponse res = new PlatilloResponse();
            res.setStatus(false);
            res.setHttpStatusCode("204");
            res.setMessage("No hay platillos");
            return new ResponseEntity<>(res,HttpStatus.NO_CONTENT);
        }
        
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseFormat> create(@RequestBody PlatilloRequest req){
        try {
            PlatilloResponse res = new PlatilloResponse();
            PlatilloModel model = PlatilloMapper.INSTANCE.RequestToModel(req);
            PlatilloDTO reserva = PlatilloMapper.INSTANCE.ModelToDto(platilloService.create(model));
            JsonNode data = objectMapper.readTree(objectMapper.writeValueAsString(reserva));
            res.setStatus(true);
            res.setHttpStatusCode("200");
            res.setMessage("peticion correcta");
            res.setData(data);
            return new ResponseEntity<>(res,HttpStatus.OK);
        } catch (Exception e) {
            PlatilloResponse res = new PlatilloResponse();
            res.setStatus(false);
            res.setHttpStatusCode("500");
            res.setMessage("Ocurrio un al error al registrar platillo");
            return new ResponseEntity<>(res,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

}
