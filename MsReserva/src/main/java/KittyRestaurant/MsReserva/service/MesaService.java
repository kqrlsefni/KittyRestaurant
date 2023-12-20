package KittyRestaurant.MsReserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsReserva.model.MesaModel;
import KittyRestaurant.MsReserva.repository.IMesaRepository;

@Service
public class MesaService {
   
    
    @Autowired
    IMesaRepository mesaRepository;

    public MesaModel create(MesaModel mesa) {
        try {
            return mesaRepository.save(mesa);
        } catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }
    }

    public Optional<MesaModel> getById(int id){
        try{
            return mesaRepository.findById(id);
    }catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }}

    public List<MesaModel> findAll() {
        try{
            return (List<MesaModel>) mesaRepository.findAll();
    }catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }
            
        }

 public boolean deleteById(int id) {
    try {
        mesaRepository.deleteById(id);
        return true;
    } catch (EmptyResultDataAccessException e) {
        
        return false;
    } catch (Exception e) {
        
        e.printStackTrace(); 
        return false;
    }
}

public MesaModel update(MesaModel mesa) {
    try {
        Optional<MesaModel> mesaExistente = mesaRepository.findById(mesa.getId_mesa());

        if (mesaExistente.isPresent()) {
            MesaModel mesaActualizado = mesaExistente.get();
            mesaActualizado.setCapacidad(mesa.getCapacidad());
            mesaActualizado.setEstado(mesa.getEstado());
            mesaActualizado.setFechacreacion(mesa.getFechacreacion());
            mesaActualizado.setUsuariocreacion(mesa.usuario_creacion);
            mesaActualizado.setFechaultimamodficacion(mesa.getFechaultimamodificacion());
            mesaActualizado.setUsuarioultimamodficacion(mesa.getUsuarioultimamodificacion());
            mesaActualizado.setIdsede(mesa.getId_sede());

            return mesaRepository.save(mesaActualizado);
        } else {
            
            throw new IllegalArgumentException("La mesa con ID " + mesa.getId_mesa() + " no existe");
        }
    } catch (Exception e) {
        
        e.printStackTrace(); 
        return null; 
    }
}

    
    }
