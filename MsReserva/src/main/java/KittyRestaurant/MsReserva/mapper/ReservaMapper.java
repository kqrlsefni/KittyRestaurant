package KittyRestaurant.MsReserva.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.model.ReservaModel;

@Mapper
public interface ReservaMapper {
    ReservaMapper INSTANCE = Mappers.getMapper( ReservaMapper.class );

    ReservaModel ReserservaRequestlToReservaModel(ReservaRequest req);
    ReservaDTO ReservaModelToReservaDTO(ReservaModel reservaModel);
}
