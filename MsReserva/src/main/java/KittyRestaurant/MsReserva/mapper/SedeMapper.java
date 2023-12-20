package KittyRestaurant.MsReserva.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsReserva.dto.SedeDTO;
import KittyRestaurant.MsReserva.dto.SedeRequest;
import KittyRestaurant.MsReserva.model.SedeModel;

    @Mapper
public interface SedeMapper{

    SedeMapper INSTANCE = Mappers.getMapper(SedeMapper.class);

    SedeModel SedeRequestToSedeModel(SedeRequest req);
    SedeDTO SedeModelToSedeDTO(SedeModel sedeModel);
}

