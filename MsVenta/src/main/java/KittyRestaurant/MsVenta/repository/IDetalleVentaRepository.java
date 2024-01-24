package KittyRestaurant.MsVenta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsVenta.model.DetalleVentaModel;

@Repository
public interface IDetalleVentaRepository extends CrudRepository <DetalleVentaModel,Integer> {

    
}