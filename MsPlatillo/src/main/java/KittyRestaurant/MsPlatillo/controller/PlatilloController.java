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

import KittyRestaurant.MsPlatillo.model.PlatilloModel;
import KittyRestaurant.MsPlatillo.service.PlatilloService;




@RestController
@RequestMapping("/api/platillo")

public class PlatilloController {

    @Autowired
    PlatilloService platilloService;

    @PostMapping("/create")
    public PlatilloModel create(@RequestBody PlatilloModel platillo) {
                return platilloService.create(platillo);
    }
    
    @GetMapping("getById/{id}")
    public Optional<PlatilloModel> getById(@PathVariable int IdPlatillo) {
        return platilloService.getById(IdPlatillo);
    }

    @PutMapping("update")
    public ResponseEntity <PlatilloModel> updatePlatillo(@RequestBody PlatilloModel platillo) {
        PlatilloModel platilloActualizado = platilloService.update(platillo);

        if(platilloActualizado !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.platilloService.eliminarPlatillo(id);
        
        if(ok){
            return "Se elimino el platillo con id "+ id;

        }else{
            return "No se pudo eliminar el platillo con id"+ id;
        }
    }
    
}
