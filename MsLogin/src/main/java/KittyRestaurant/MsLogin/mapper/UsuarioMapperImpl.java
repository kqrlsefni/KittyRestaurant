package KittyRestaurant.MsLogin.mapper;

import KittyRestaurant.MsLogin.dto.UsuarioDTO;
import KittyRestaurant.MsLogin.dto.UsuarioRequest;
import KittyRestaurant.MsLogin.model.UsuarioModel;
public class UsuarioMapperImpl implements UsuarioMapper {

@Override
public UsuarioModel UsuarioRequestToUsuarioModel(UsuarioRequest req) {
if ( req == null ) {
return null;
}
UsuarioModel model = new UsuarioModel();
model.IdUsuario = req.getIdUsuario();
model.usuario = req.getUsuario();
model.contraseña = req.getContraseña();
model.rol = req.getRol();
model.FechaCreacion = req.getFechaCreacion();
model.UsuarioCreacion = req.getUsuarioCreacion();
model.UltimaFechaModificacion = req.getUltimaFechaModificacion();
model.UltimoUsuarioModificacion = req.getUltimoUsuarioModificacion();
return model;
}

@Override
public UsuarioDTO UsuarioModelToUsuarioDTO(UsuarioModel model) {
if ( model == null ) {
return null;
}
UsuarioDTO sdto = new UsuarioDTO(
model.IdUsuario,
model.usuario,
model.contraseña,
model.rol);
return sdto;
}
}
