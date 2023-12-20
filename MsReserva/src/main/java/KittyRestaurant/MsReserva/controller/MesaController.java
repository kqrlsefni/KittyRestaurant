package KittyRestaurant.MsReserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
            // Manejar la excepción según tus necesidades
            e.printStackTrace(); // Imprime el seguimiento de la pila en la consola (puedes cambiar esto según tus necesidades)
    
            // Puedes enviar una respuesta de error adecuada
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
