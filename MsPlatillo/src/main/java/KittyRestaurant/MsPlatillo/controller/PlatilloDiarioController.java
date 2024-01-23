package KittyRestaurant.MsPlatillo.controller;

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

import KittyRestaurant.MsPlatillo.model.PlatilloDiarioModel;
import KittyRestaurant.MsPlatillo.service.PlatilloDiarioService;




@RestController
@RequestMapping("/api/platillodiario")

public class PlatilloDiarioController {

    @Autowired
    PlatilloDiarioService platilloDiarioService;

    @PostMapping("/create")
    public PlatilloDiarioModel create(@RequestBody PlatilloDiarioModel platillodiario) {
                return platilloDiarioService.create(platillodiario);
    }
    
    @GetMapping("getById/{id}")
    public Optional<PlatilloDiarioModel> getById(@PathVariable int IdPlatilloDiario) {
        return platilloDiarioService.getById(IdPlatilloDiario);
    }

    @PutMapping("update")
    public ResponseEntity <PlatilloDiarioModel> updatePlatilloDiario(@RequestBody PlatilloDiarioModel platillodiario) {
        PlatilloDiarioModel platilloDiarioActualizado = platilloDiarioService.update(platillodiario);

        if(platilloDiarioActualizado !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.platilloDiarioService.eliminarPlatilloDiario(id);
        
        if(ok){
            return "Se elimino el Platillo Diario con id "+ id;

        }else{
            return "No se pudo eliminar el Platillo Diario con id"+ id;
        }
    }
    
}
