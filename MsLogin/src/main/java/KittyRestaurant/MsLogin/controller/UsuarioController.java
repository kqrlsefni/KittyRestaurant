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

import KittyRestaurant.MsLogin.model.UsuarioModel;
import KittyRestaurant.MsLogin.service.UsuarioService;




@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel usuario) {
                return usuarioService.create(usuario);
    }
    
    @GetMapping("getById/{id}")
    public Optional<UsuarioModel> getById(@PathVariable int IdUsuario) {
        return usuarioService.getById(IdUsuario);
    }

    @PutMapping("update")
    public ResponseEntity <UsuarioModel> updateSede(@RequestBody UsuarioModel usuario) {
        UsuarioModel usuarioActualizado = usuarioService.update(usuario);

        if(usuarioActualizado !=null){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok= this.usuarioService.eliminarUsuario(id);
        
        if(ok){
            return "Se elimino el usuario con id "+ id;

        }else{
            return "No se pudo eliminar el usuario con id"+ id;
        }
    }
    
}
