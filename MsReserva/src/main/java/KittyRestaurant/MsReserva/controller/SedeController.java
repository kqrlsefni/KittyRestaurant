package KittyRestaurant.MsReserva.controller;

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
import org.springframework.web.bind.annotation.RestController;

import KittyRestaurant.MsReserva.model.SedeModel;
import KittyRestaurant.MsReserva.service.SedeService;




@RestController
@RequestMapping("/api/sede")
public class SedeController {

    @Autowired
    SedeService sedeService;

    @PostMapping("/create")
    public SedeModel create(@RequestBody SedeModel sede) {
                return sedeService.create(sede);
    }
    
    @GetMapping("getById/{id}")
    public Optional<SedeModel> getById(@PathVariable int IdSede) {
        return sedeService.getById(IdSede);
    }

    @PutMapping("update")
    public ResponseEntity <SedeModel> updateSede(@RequestBody SedeModel sede) {
        SedeModel sedeActualizada = sedeService.update(sede);

        if(sedeActualizada !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.sedeService.eliminarSede(id);
        
        if(ok){
            return "Se elimino la sede con id "+ id;

        }else{
            return "No se pudo eliminar la sede con id"+ id;
        }
    }
}
