package KittyRestaurant.MsPlatillo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsPlatillo.dto.PlatilloDiarioDTO;
import KittyRestaurant.MsPlatillo.dto.PlatilloDiarioRequest;
import KittyRestaurant.MsPlatillo.model.PlatilloDiarioModel;

@Mapper
public interface PlatilloDiarioMapper{

    PlatilloDiarioMapper INSTANCE = Mappers.getMapper(PlatilloDiarioMapper.class);

    PlatilloDiarioModel PlatilloDiarioRequestToPlatilloDiarioModel(PlatilloDiarioRequest req);
    PlatilloDiarioDTO PlatilloDiarioModelToPlatilloDiarioDTO(PlatilloDiarioModel platilloDiarioModel);
}
