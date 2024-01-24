package KittyRestaurant.MsVenta.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsVenta.dto.VentaDTO;
import KittyRestaurant.MsVenta.dto.VentaRequest;
import KittyRestaurant.MsVenta.model.VentaModel;

@Mapper
public interface VentaMapper{

    VentaMapper INSTANCE = Mappers.getMapper(VentaMapper.class);

    VentaModel VentaRequestToVentaModel(VentaRequest req);
    VentaDTO VentaModelToVentaDTO(VentaModel ventaModel);
}
