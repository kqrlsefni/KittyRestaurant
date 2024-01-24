package KittyRestaurant.MsVenta.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import KittyRestaurant.MsVenta.dto.DetalleVentaDTO;
import KittyRestaurant.MsVenta.dto.DetalleVentaRequest;
import KittyRestaurant.MsVenta.model.DetalleVentaModel;

@Mapper
public interface DetalleVentaMapper{

    DetalleVentaMapper INSTANCE = Mappers.getMapper(DetalleVentaMapper.class);

    DetalleVentaModel DetalleVentaRequestToDetalleVentaModel(DetalleVentaRequest req);
    DetalleVentaDTO DetalleVentaModelToDetalleVentaDTO(DetalleVentaModel detalleVentaModel);
}
