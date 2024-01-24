package KittyRestaurant.MsVenta.mapper;

import KittyRestaurant.MsVenta.dto.VentaDTO;
import KittyRestaurant.MsVenta.dto.VentaRequest;
import KittyRestaurant.MsVenta.model.VentaModel;
public class VentaMapperImpl implements VentaMapper {

@Override
public VentaModel VentaRequestToVentaModel(VentaRequest req) {
if ( req == null ) {
return null;
}
VentaModel model = new VentaModel();
model.IdVenta = req.getIdVenta();
model.TipoComprobante = req.getTipoComprobante();
model.MontoPagar = req.getMontoPagar();
model.NumeroDeDocumento = req.getNumeroDeDocumento();
model.Fecha = req.getFecha();
model.MedioDePago = req.getMedioDePago();
model.FechaCreacion = req.getFechaCreacion();
model.UsuarioCreacion = req.getUsuarioCreacion();
model.UltimaFechaModificacion = req.getUltimaFechaModificacion();
model.UltimoUsuarioModificacion = req.getUltimoUsuarioModificacion();
return model;
}

@Override
public VentaDTO VentaModelToVentaDTO(VentaModel model) {
if ( model == null ) {
return null;
}
VentaDTO sdto = new VentaDTO(
model.IdVenta,
model.TipoComprobante,
model.MontoPagar,
model.NumeroDeDocumento,
model.Fecha,
model.MedioDePago);
return sdto;
}
}
