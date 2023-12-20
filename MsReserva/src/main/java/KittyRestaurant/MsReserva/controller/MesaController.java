package KittyRestaurant.MsReserva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


    
}
