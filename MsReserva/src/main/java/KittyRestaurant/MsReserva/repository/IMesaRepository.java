package KittyRestaurant.MsReserva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsReserva.model.MesaModel;

@Repository
public interface IMesaRepository extends CrudRepository<MesaModel, Integer> {
    
}
