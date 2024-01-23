package KittyRestaurant.MsLogin.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsLogin.dto.UsuarioDTO;
import KittyRestaurant.MsLogin.dto.UsuarioRequest;
import KittyRestaurant.MsLogin.model.UsuarioModel;

@Mapper
public interface UsuarioMapper{

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioModel UsuarioRequestToUsuarioModel(UsuarioRequest req);
    UsuarioDTO UsuarioModelToUsuarioDTO(UsuarioModel usuarioModel);
}
