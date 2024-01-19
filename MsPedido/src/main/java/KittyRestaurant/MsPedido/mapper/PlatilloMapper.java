package KittyRestaurant.MsPedido.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsPedido.dto.PlatilloDTO;
import KittyRestaurant.MsPedido.dto.PlatilloRequest;
import KittyRestaurant.MsPedido.model.PlatilloModel;

public interface PlatilloMapper {
    PlatilloMapper INSTANCE = Mappers.getMapper( PlatilloMapper.class );

    PlatilloModel RequestToModel(PlatilloRequest req);
    PlatilloRequest ModelToRequest(PlatilloModel mod);
    PlatilloDTO ModelToDto(PlatilloModel reservaModel);
    List<PlatilloDTO> ListModelToListDto(List<PlatilloModel> mod);
}
