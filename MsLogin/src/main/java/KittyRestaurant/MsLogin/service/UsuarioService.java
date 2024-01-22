package KittyRestaurant.MsLogin.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsLogin.model.UsuarioModel;
import KittyRestaurant.MsLogin.repository.IUsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    IUsuarioRepository usuarioRepository;

    public UsuarioModel create(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getById(int IdUsuario){
        return usuarioRepository.findById(IdUsuario);
    }

    public UsuarioModel update(UsuarioModel usuario){
        Optional<UsuarioModel>UsuarioExistente =usuarioRepository.findById(usuario.getIdUsuario());

        if(UsuarioExistente.isPresent()){
            UsuarioModel usuarioActualizado = UsuarioExistente.get();
            usuarioActualizado.setusuario(usuario.getusuario());
            usuarioActualizado.setcontraseña(usuario.getcontraseña());
            usuarioActualizado.setrol(usuario.getrol());
            usuarioActualizado.setFechaCreacion(usuario.getFechaCreacion());
            usuarioActualizado.setUsuarioCreacion(usuario.getUsuarioCreacion());
            usuarioActualizado.setUltimaFechaModificacion(usuario.getUltimaFechaModificacion());
            usuarioActualizado.setUltimoUsuarioModificacion(usuario.getUltimoUsuarioModificacion());
            return usuarioRepository.save(usuarioActualizado);
        }else{
            return null;
        }
    }

    public boolean eliminarUsuario(int IdUsuario){
        try{
            usuarioRepository.deleteById(IdUsuario);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}