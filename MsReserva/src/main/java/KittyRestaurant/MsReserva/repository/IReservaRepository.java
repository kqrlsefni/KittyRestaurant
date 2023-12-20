package KittyRestaurant.MsReserva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import KittyRestaurant.MsReserva.model.ReservaModel;
@Repository
public interface IReservaRepository extends CrudRepository<ReservaModel, Integer> {
}
