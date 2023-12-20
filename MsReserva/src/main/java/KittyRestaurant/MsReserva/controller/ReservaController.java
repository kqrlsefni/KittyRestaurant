package KittyRestaurant.MsReserva.controller;

import org.springframework.web.bind.annotation.RestController;
import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.dto.ReservaResponse;
import KittyRestaurant.MsReserva.dto.ResponseFormat;
import KittyRestaurant.MsReserva.mapper.ReservaMapper;
import KittyRestaurant.MsReserva.model.ReservaModel;
import KittyRestaurant.MsReserva.service.ReservaService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    
    @Autowired
    ReservaService reservaService;
    
    @GetMapping("/getAll")
    public ResponseEntity<ResponseFormat> getAll() {
        
        try {
        ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        List<ReservaDTO> reservas = reservaService.getAll().stream().map(
            ReservaModel -> new ReservaDTO(
                ReservaModel.idReserva,
                ReservaModel.cantidadPersona,
                ReservaModel.fechaHora,
                ReservaModel.descripcion,
                ReservaModel.estado,
                ReservaModel.numeroContacto,
                ReservaModel.nombreContacto
            )
        ).collect(Collectors.toList());
        if(reservas.size() == 0){
            throw new Exception();
        }
        response.setStatus(true);
        response.setHttpStatusCode("200");
        response.setMessage("peticion correcta");
        response.setData(reservas);
        return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
        ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(false);
        response.setHttpStatusCode("204");
        response.setMessage("No hay reservas");
        return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
        }
        
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ResponseFormat> getById(@PathVariable int id){
        
        try {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
            List<ReservaDTO> reservas = reservaService.getById(id).stream().map(
            ReservaModel -> new ReservaDTO(
                ReservaModel.idReserva,
                ReservaModel.cantidadPersona,
                ReservaModel.fechaHora,
                ReservaModel.descripcion,
                ReservaModel.estado,
                ReservaModel.numeroContacto,
                ReservaModel.nombreContacto
            )
        ).collect(Collectors.toList());
        if(reservas.size() == 0){
            throw new Exception();
        }
            response.setStatus(true);
        response.setHttpStatusCode("200");
        response.setMessage("peticion correcta");
        
        response.setData(reservas);
        return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
            response.setStatus(false);
            response.setHttpStatusCode("400");
            response.setMessage(e.getMessage());
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
        
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseFormat> create(@RequestBody ReservaRequest reserva){
        try {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(true);
        response.setHttpStatusCode("200");
        response.setMessage("peticion correcta");
        
        ReservaModel model = ReservaMapper.INSTANCE.ReserservaRequestlToReservaModel(reserva);
        Iterable<ReservaDTO> reservas = Optional.of(reservaService.create(model)).stream().map(
            ReservaModel -> new ReservaDTO(
                ReservaModel.idReserva,
                ReservaModel.cantidadPersona,
                ReservaModel.fechaHora,
                ReservaModel.descripcion,
                ReservaModel.estado,
                ReservaModel.numeroContacto,
                ReservaModel.nombreContacto
            )
        ).collect(Collectors.toList());
        response.setData(reservas);
        return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(false);
        response.setHttpStatusCode("500");
        response.setMessage("Ocurrio un al error al registrar");
        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseFormat> update(@RequestBody ReservaRequest reserva){
        try {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(true);
        response.setHttpStatusCode("200");
        response.setMessage("peticion correcta");
        
        ReservaModel model = ReservaMapper.INSTANCE.ReserservaRequestlToReservaModel(reserva);
        Iterable<ReservaDTO> reservas = Optional.of(reservaService.update(model)).stream().map(
            ReservaModel -> new ReservaDTO(
                ReservaModel.idReserva,
                ReservaModel.cantidadPersona,
                ReservaModel.fechaHora,
                ReservaModel.descripcion,
                ReservaModel.estado,
                ReservaModel.numeroContacto,
                ReservaModel.nombreContacto
            )
        ).collect(Collectors.toList());
        response.setData(reservas);
        return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
            ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(false);
        response.setHttpStatusCode("500");
        response.setMessage("Ocurrio un al error al actualizar");
        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseFormat> delete(@PathVariable int id) {
        
        try {
        ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        boolean eliminar = reservaService.delete(id);
        if(eliminar==false){
            throw new Exception();
        }
        response.setStatus(true);
        response.setHttpStatusCode("200");
        response.setMessage("eliminado correctamente");
        //response.setData(reservas);
        return new ResponseEntity<>(response,HttpStatus.OK);
        } catch (Exception e) {
        ReservaResponse<ReservaDTO> response = new ReservaResponse<>();
        response.setStatus(false);
        response.setHttpStatusCode("400");
        response.setMessage("error al eliminar");
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
        
    }
}
