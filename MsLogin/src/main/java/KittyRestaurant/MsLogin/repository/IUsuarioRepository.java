package KittyRestaurant.MsLogin.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import KittyRestaurant.MsLogin.model.UsuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository <UsuarioModel,Integer> {

    
}
