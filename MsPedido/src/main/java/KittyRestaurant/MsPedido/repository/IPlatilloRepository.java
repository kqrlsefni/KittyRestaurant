package KittyRestaurant.MsPedido.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsPedido.model.PlatilloModel;

@Repository
public interface IPlatilloRepository extends CrudRepository<PlatilloModel, Integer> {
    
}
