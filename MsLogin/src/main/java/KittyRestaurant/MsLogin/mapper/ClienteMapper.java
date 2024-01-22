package KittyRestaurant.MsLogin.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsLogin.dto.ClienteDTO;
import KittyRestaurant.MsLogin.dto.ClienteRequest;
import KittyRestaurant.MsLogin.model.ClienteModel;

@Mapper
public interface ClienteMapper{

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteModel ClienteRequestToClienteModel(ClienteRequest req);
    ClienteDTO ClienteModelToClienteDTO(ClienteModel clienteModel);
}
