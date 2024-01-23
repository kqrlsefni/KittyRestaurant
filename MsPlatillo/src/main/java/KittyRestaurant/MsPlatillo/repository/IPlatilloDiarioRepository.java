package KittyRestaurant.MsPlatillo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsPlatillo.model.PlatilloDiarioModel;

@Repository
public interface IPlatilloDiarioRepository extends CrudRepository <PlatilloDiarioModel,Integer> {

    
}
