package KittyRestaurant.MsReserva.dto;

public class SedeRequest {
private int idSede;
private String nombre;
private String direccion;
private String fechaCreacion;
private String usuarioCreacion;
private String ultimaFechaModificacion;
private String ultimoUsuarioModificacion;

public SedeRequest(
int idSede,
String nombre,
String direccion,
String fechaCreacion,
String usuarioCreacion,
String ultimaFechaModificacion,
String ultimoUsuarioModificacion)
{

this.idSede = idSede;
this.nombre = nombre;
this.direccion = direccion;
this.fechaCreacion = fechaCreacion;
this.usuarioCreacion = usuarioCreacion;
this.ultimaFechaModificacion = ultimaFechaModificacion;
this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
}

public int getIdSede() {
return idSede;
}

public void setIdSede(int idSede) {
this.idSede = idSede;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getDireccion() {
return direccion;
}

public void setDireccion(String direccion) {
this.direccion = direccion;
}

public String getFechaCreacion() {
return fechaCreacion;
}

public void setFechaCreacion(String fechaCreacion) {
this.fechaCreacion = fechaCreacion;
}

public String getUsuarioCreacion() {
return usuarioCreacion;
}

public void setUsuarioCreacion(String usuarioCreacion) {
this.usuarioCreacion = usuarioCreacion;
}

public String getUltimaFechaModificacion() {
return ultimaFechaModificacion;
}

public void setUltimaFechaModificacion(String ultimaFechaModificacion) {
this.ultimaFechaModificacion = ultimaFechaModificacion;
}

public String getUltimoUsuarioModificacion() {
return ultimoUsuarioModificacion;
}

public void setUltimoUsuarioModificacion(String ultimoUsuarioModificacion) {
this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
}
}
