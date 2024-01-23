package KittyRestaurant.MsVenta.mapper;

import KittyRestaurant.MsVenta.dto.DetalleVentaDTO;
import KittyRestaurant.MsVenta.dto.DetalleVentaRequest;
import KittyRestaurant.MsVenta.model.DetalleVentaModel;
public class DetalleVentaMapperImpl implements DetalleVentaMapper {

@Override
public DetalleVentaModel DetalleVentaRequestToDetalleVentaModel(DetalleVentaRequest req) {
if ( req == null ) {
return null;
}
DetalleVentaModel model = new DetalleVentaModel();
model.IdDetalleVenta = req.getIdDetalleVenta();
model.IdVenta = req.getIdVenta();
model.Cantidad = req.getCantidad();
model.Precio = req.getPrecio();
model.IdPedido = req.getIdPedido();
model.IdPlatilloDiario = req.getIdPlatilloDiario();
return model;
}

@Override
public DetalleVentaDTO DetalleVentaModelToDetalleVentaDTO(DetalleVentaModel model) {
if ( model == null ) {
return null;
}
DetalleVentaDTO sdto = new DetalleVentaDTO(
model.IdDetalleVenta,
model.IdVenta,
model.IdPedido,
model.IdPlatilloDiario);
return sdto;
}
}
