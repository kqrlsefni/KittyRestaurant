package KittyRestaurant.MsVenta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsVenta.model.VentaModel;

@Repository
public interface IVentaRepository extends CrudRepository <VentaModel,Integer> {

    
}
