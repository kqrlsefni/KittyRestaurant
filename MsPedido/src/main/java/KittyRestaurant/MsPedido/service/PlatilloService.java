package KittyRestaurant.MsPedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KittyRestaurant.MsPedido.model.PlatilloModel;
import KittyRestaurant.MsPedido.repository.IPlatilloRepository;
import jakarta.persistence.Cacheable;

@Service
public class PlatilloService {
    
    @Autowired
    IPlatilloRepository PlatilloRepository;
    
    @Cacheable("getAll")
     public List<PlatilloModel> getAll(){
        return (List<PlatilloModel>) PlatilloRepository.findAll();
    }

    @Cacheable("create")
    public PlatilloModel create(PlatilloModel model){
        return PlatilloRepository.save(model);
   }
}
