package KittyRestaurant.MsLogin.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsLogin.model.ClienteModel;

@Repository
public interface IClienteRepository extends CrudRepository <ClienteModel,Integer> {

    
}

