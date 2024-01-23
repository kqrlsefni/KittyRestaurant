package KittyRestaurant.MsPlatillo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsPlatillo.model.PlatilloModel;

@Repository
public interface IPlatilloRepository extends CrudRepository <PlatilloModel,Integer> {

    
}