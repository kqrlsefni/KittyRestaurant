package KittyRestaurant.MsPlatillo.mapper;

import KittyRestaurant.MsPlatillo.dto.PlatilloDTO;
import KittyRestaurant.MsPlatillo.dto.PlatilloRequest;
import KittyRestaurant.MsPlatillo.model.PlatilloModel;
public class PlatilloMapperImpl implements PlatilloMapper {

@Override
public PlatilloModel PlatilloRequestToPlatilloModel(PlatilloRequest req) {
if ( req == null ) {
return null;
}
PlatilloModel model = new PlatilloModel();
model.IdPlatillo = req.getIdPlatillo();
model.Nombre = req.getNombre();
model.Descripcion = req.getDescripcion();
return model;
}

@Override
public PlatilloDTO PlatilloModelToPlatilloDTO(PlatilloModel model) {
if ( model == null ) {
return null;
}
PlatilloDTO sdto = new PlatilloDTO(
model.IdPlatillo,
model.Nombre);
return sdto;
}
}
