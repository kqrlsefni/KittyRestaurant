package KittyRestaurant.MsLogin.mapper;

import KittyRestaurant.MsLogin.dto.ClienteDTO;
import KittyRestaurant.MsLogin.dto.ClienteRequest;
import KittyRestaurant.MsLogin.model.ClienteModel;
public class ClienteMapperImpl implements ClienteMapper {

@Override
public ClienteModel ClienteRequestToClienteModel(ClienteRequest req) {
if ( req == null ) {
return null;
}
ClienteModel model = new ClienteModel();
model.IdCliente = req.getIdCliente();
model.Nombre = req.getNombre();
model.Apellido = req.getApellido();
model.TipoDeDocumento = req.getTipoDeDocumento();
model.NumeroDeDocumento = req.getNumeroDeDocumento();
model.Correo = req.getCorreo();
model.FechaCreacion = req.getFechaCreacion();
model.UsuarioCreacion = req.getUsuarioCreacion();
model.UltimaFechaModificacion = req.getUltimaFechaModificacion();
model.UltimoUsuarioModificacion = req.getUltimoUsuarioModificacion();
return model;
}

@Override
public ClienteDTO ClienteModelToClienteDTO(ClienteModel model) {
if ( model == null ) {
return null;
}
ClienteDTO sdto = new ClienteDTO(
model.IdCliente,
model.Nombre,
model.Apellido,
model.TipoDeDocumento,
model.NumeroDeDocumento,
model.Correo);
return sdto;
}
}
