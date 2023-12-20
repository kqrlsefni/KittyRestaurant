package KittyRestaurant.MsReserva.mapper;

import KittyRestaurant.MsReserva.dto.SedeDTO;
import KittyRestaurant.MsReserva.dto.SedeRequest;
import KittyRestaurant.MsReserva.model.SedeModel;
public class SedeMapperImpl implements SedeMapper {

@Override
public SedeModel SedeRequestToSedeModel(SedeRequest req) {
if ( req == null ) {
return null;
}
SedeModel model = new SedeModel();
model.IdSede = req.getIdSede();
model.Nombre = req.getNombre();
model.Direccion = req.getDireccion();
model.UsuarioCreacion = req.getUsuarioCreacion();
model.FechaCreacion = req.getFechaCreacion();
model.UltimoUsuarioModificacion = req.getUltimoUsuarioModificacion();
model.UltimaFechaModificacion = req.getUltimaFechaModificacion();
return model;
}

@Override
public SedeDTO SedeModelToSedeDTO(SedeModel model) {
if ( model == null ) {
return null;
}
SedeDTO sdto = new SedeDTO(
model.IdSede,
model.Nombre,
model.Direccion);

return sdto;
}
}

