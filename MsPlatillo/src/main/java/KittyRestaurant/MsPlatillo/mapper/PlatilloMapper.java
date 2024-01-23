package KittyRestaurant.MsPlatillo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsPlatillo.dto.PlatilloDTO;
import KittyRestaurant.MsPlatillo.dto.PlatilloRequest;
import KittyRestaurant.MsPlatillo.model.PlatilloModel;

@Mapper
public interface PlatilloMapper{

    PlatilloMapper INSTANCE = Mappers.getMapper(PlatilloMapper.class);

    PlatilloModel PlatilloRequestToPlatilloModel(PlatilloRequest req);
    PlatilloDTO PlatilloModelToPlatilloDTO(PlatilloModel platilloModel);
}
