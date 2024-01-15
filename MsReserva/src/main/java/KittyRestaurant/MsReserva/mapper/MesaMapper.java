package KittyRestaurant.MsReserva.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsReserva.dto.MesaDTO;
import KittyRestaurant.MsReserva.dto.MesaRequest;

import KittyRestaurant.MsReserva.model.MesaModel;


@Mapper
public interface MesaMapper {
    MesaMapper INSTANCE = Mappers.getMapper( MesaMapper.class );

    MesaModel RequestToModel(MesaRequest req);
    MesaRequest ModelToRequest(MesaModel mod);
    MesaDTO ModelToDto(MesaModel mesaModel);
    List<MesaDTO> ListModelToListDto(List<MesaModel> mod);
}
