package KittyRestaurant.MsLogin.controller;

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

import KittyRestaurant.MsLogin.model.ClienteModel;
import KittyRestaurant.MsLogin.service. ClienteService;




@RestController
@RequestMapping("/api/cliente")

public class ClienteController {

    
    @Autowired
    ClienteService clienteService;

    @PostMapping("/create")
    public ClienteModel create(@RequestBody ClienteModel cliente) {
                return clienteService.create(cliente);
    }
    
    @GetMapping("getById/{id}")
    public Optional<ClienteModel> getById(@PathVariable int IdCliente) {
        return clienteService.getById(IdCliente);
    }

    @PutMapping("update")
    public ResponseEntity <ClienteModel> updateSede(@RequestBody ClienteModel cliente) {
        ClienteModel clienteActualizado = clienteService.update(cliente);

        if(clienteActualizado !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.clienteService.eliminarCliente(id);
        
        if(ok){
            return "Se elimino la sede con id "+ id;

        }else{
            return "No se pudo eliminar la sede con id"+ id;
        }
    }
    
}
