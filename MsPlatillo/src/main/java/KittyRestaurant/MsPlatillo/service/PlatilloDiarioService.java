package KittyRestaurant.MsPlatillo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsPlatillo.model.PlatilloDiarioModel;
import KittyRestaurant.MsPlatillo.repository.IPlatilloDiarioRepository;

@Service
public class PlatilloDiarioService {
    @Autowired
    IPlatilloDiarioRepository platilloDiarioRepository;

    public PlatilloDiarioModel create(PlatilloDiarioModel platillodiario){
        return platilloDiarioRepository.save(platillodiario);
    }

    public Optional<PlatilloDiarioModel> getById(int IdPlatilloDiario){
        return platilloDiarioRepository.findById(IdPlatilloDiario);
    }

    public PlatilloDiarioModel update(PlatilloDiarioModel platillodiario){
        Optional<PlatilloDiarioModel>PlatilloDiarioExistente =platilloDiarioRepository.findById(platillodiario.getIdPlatilloDiario());

        if(PlatilloDiarioExistente.isPresent()){
            PlatilloDiarioModel platilloDiarioActualizado = PlatilloDiarioExistente.get();
            platilloDiarioActualizado.setNombre(platillodiario.getNombre());
            platilloDiarioActualizado.setPrecio(platillodiario.getPrecio());
            platilloDiarioActualizado.setCantidadDisponible(platillodiario.getCantidadDisponible());
            platilloDiarioActualizado.setCategoria(platillodiario.getCategoria());
            platilloDiarioActualizado.setFecha(platillodiario.getFecha());
            platilloDiarioActualizado.setFechaCreacion(platillodiario.getFechaCreacion());
            platilloDiarioActualizado.setUsuarioCreacion(platillodiario.getUsuarioCreacion());
            platilloDiarioActualizado.setUltimaFechaModificacion(platillodiario.getUltimaFechaModificacion());
            platilloDiarioActualizado.setUltimoUsuarioModificacion(platillodiario.getUltimoUsuarioModificacion());
            return platilloDiarioRepository.save(platilloDiarioActualizado);
        }else{
            return null;
        }
    }

    public boolean eliminarPlatilloDiario(int IdPlatilloDiario){
        try{
            platilloDiarioRepository.deleteById(IdPlatilloDiario);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}

