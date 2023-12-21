package KittyRestaurant.MsReserva.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsReserva.dto.ReservaDTO;
import KittyRestaurant.MsReserva.dto.ReservaRequest;
import KittyRestaurant.MsReserva.model.ReservaModel;

@Mapper
public interface ReservaMapper {
    ReservaMapper INSTANCE = Mappers.getMapper( ReservaMapper.class );

    ReservaModel RequestToModel(ReservaRequest req);
    ReservaRequest ModelToRequest(ReservaModel mod);
    ReservaDTO ModelToDto(ReservaModel reservaModel);
    List<ReservaDTO> ListModelToListDto(List<ReservaModel> mod);
}
