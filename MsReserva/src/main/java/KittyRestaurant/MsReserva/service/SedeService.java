package KittyRestaurant.MsReserva.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsReserva.model.SedeModel;
import KittyRestaurant.MsReserva.repository.ISedeRepository;

@Service
public class SedeService {

    @Autowired
    ISedeRepository sedeRepository;

    public SedeModel create(SedeModel sede){
        return sedeRepository.save(sede);
    }

    public Optional<SedeModel> getById(int IdSede){
        return sedeRepository.findById(IdSede);
    }

    public SedeModel update(SedeModel sede){
        Optional<SedeModel>SedeExistente =sedeRepository.findById(sede.getIdSede());

        if(SedeExistente.isPresent()){
            SedeModel sedeActualizada = SedeExistente.get();
            sedeActualizada.setNombreSede(sede.getNombreSede());
            sedeActualizada.setDireccionSede(sede.getDireccionSede());
            sedeActualizada.setFechaCreacionSede(sede.getFechaCreacionSede());
            sedeActualizada.setUsuarioCreacionSede(sede.getUsuarioCreacionSede());
            sedeActualizada.setUltimaFechaModificacionSede(sede.getUltimaFechaModificacionSede());
            sedeActualizada.setUltimoUsuarioModificacionSede(sede.getUltimoUsuarioModificacionSede());
            return sedeRepository.save(sedeActualizada);
        }else{
            return null;
        }
    }

    public boolean eliminarSede(int IdSede){
        try{
            sedeRepository.deleteById(IdSede);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}
