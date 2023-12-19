package KittyRestaurant.MsReserva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsReserva.model.SedeModel;

@Repository
public interface ISedeRepository extends CrudRepository <SedeModel,Integer> {

    
}
