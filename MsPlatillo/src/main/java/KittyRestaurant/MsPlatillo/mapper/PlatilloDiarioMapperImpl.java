package KittyRestaurant.MsPlatillo.mapper;

import KittyRestaurant.MsPlatillo.dto.PlatilloDiarioDTO;
import KittyRestaurant.MsPlatillo.dto.PlatilloDiarioRequest;
import KittyRestaurant.MsPlatillo.model.PlatilloDiarioModel;
public class PlatilloDiarioMapperImpl implements PlatilloDiarioMapper {

@Override
public PlatilloDiarioModel PlatilloDiarioRequestToPlatilloDiarioModel(PlatilloDiarioRequest req) {
if ( req == null ) {
return null;
}
PlatilloDiarioModel model = new PlatilloDiarioModel();
model.IdPlatilloDiario = req.getIdPlatilloDiario();
model.Nombre = req.getNombre();
model.Precio = req.getPrecio();
model.CantidadDisponible = req.getCantidadDisponible();
model.Categoria = req.getCategoria();
model.Fecha = req.getFecha();
model.FechaCreacion = req.getFechaCreacion();
model.UsuarioCreacion = req.getUsuarioCreacion();
model.UltimaFechaModificacion = req.getUltimaFechaModificacion();
model.UltimoUsuarioModificacion = req.getUltimoUsuarioModificacion();
return model;
}

@Override
public PlatilloDiarioDTO PlatilloDiarioModelToPlatilloDiarioDTO(PlatilloDiarioModel model) {
if ( model == null ) {
return null;
}
PlatilloDiarioDTO sdto = new PlatilloDiarioDTO(
model.IdPlatilloDiario,
model.Nombre,
model.Precio,
model.CantidadDisponible,
model.Categoria,
model.Fecha);
return sdto;
}
}