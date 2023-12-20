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
import org.springframework.web.bind.annotation.RestController;

import KittyRestaurant.MsReserva.model.MesaModel;
import KittyRestaurant.MsReserva.service.MesaService;

@RestController
@RequestMapping("/api/mesa")
public class MesaController {

    @Autowired
    MesaService mesaService;

    @PostMapping("/create")
    public ResponseEntity<MesaModel> create(@RequestBody MesaModel mesa) {
        try {
            MesaModel createdMesa = mesaService.create(mesa);
            return new ResponseEntity<>(createdMesa, HttpStatus.CREATED);
        } catch (Exception e) {
           
            e.printStackTrace();   
    
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getById/{id}")
public ResponseEntity<MesaModel> getById(@PathVariable int id) {
    try {
        Optional<MesaModel> mesa = mesaService.getById(id);

        if (mesa.isPresent()) {
            return new ResponseEntity<>(mesa.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } catch (Exception e) {
        e.printStackTrace(); 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

@GetMapping("/findAll")
public ResponseEntity<List<MesaModel>> findAll() {
    try {
        List<MesaModel> mesa = mesaService.findAll();

        if (!mesa.isEmpty()) {
            return new ResponseEntity<>(mesa, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } catch (Exception e) {
        e.printStackTrace(); 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

@DeleteMapping(path = "/delete/{id}")
public String deleteById(@PathVariable("id") int id) {
    try {
        boolean ok = this.mesaService.deleteById(id);

        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    } catch (Exception e) {
        e.printStackTrace(); 
        return "Hubo un error al intentar eliminar el usuario con id " + id;
    }
}

@PutMapping("/update")
public ResponseEntity<MesaModel> updateMesa(@RequestBody MesaModel mesa) {
    try {
        MesaModel mesaActualizado = mesaService.update(mesa);

        if (mesaActualizado != null) {
            return new ResponseEntity<>(mesaActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } catch (Exception e) {
        
        e.printStackTrace(); 
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}




    
}
