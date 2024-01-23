package KittyRestaurant.MsPlatillo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsPlatillo.model.PlatilloModel;
import KittyRestaurant.MsPlatillo.repository.IPlatilloRepository;

@Service
public class PlatilloService {
    @Autowired
    IPlatilloRepository platilloRepository;

    public PlatilloModel create(PlatilloModel platillo){
        return platilloRepository.save(platillo);
    }

    public Optional<PlatilloModel> getById(int IdPlatillo){
        return platilloRepository.findById(IdPlatillo);
    }

    public PlatilloModel update(PlatilloModel platillo){
        Optional<PlatilloModel>PlatilloExistente =platilloRepository.findById(platillo.getIdPlatillo());

        if(PlatilloExistente.isPresent()){
            PlatilloModel platilloActualizado = PlatilloExistente.get();
            platilloActualizado.setNombre(platillo.getNombre());
            platilloActualizado.setDescripcion(platillo.getDescripcion());
            return platilloRepository.save(platilloActualizado);
        }else{
            return null;
        }
    }

    public boolean eliminarPlatillo(int IdPlatillo){
        try{
            platilloRepository.deleteById(IdPlatillo);
            return true;
        }catch(Exception arr){
            return false;
        }
    }
}
