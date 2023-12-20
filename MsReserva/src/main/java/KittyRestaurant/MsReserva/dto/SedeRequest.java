package KittyRestaurant.MsReserva.dto;

import java.time.LocalDateTime;

public class SedeRequest {
private int idSede;
private String nombre;
private String direccion;
private LocalDateTime fechaCreacion;
private String usuarioCreacion;
private LocalDateTime ultimaFechaModificacion;
private String ultimoUsuarioModificacion;

public SedeRequest(
int idSede,
String nombre,
String direccion,
LocalDateTime fechaCreacion,
String usuarioCreacion,
LocalDateTime ultimaFechaModificacion,
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

public LocalDateTime getFechaCreacion() {
return fechaCreacion;
}

public void setFechaCreacion(LocalDateTime fechaCreacion) {
this.fechaCreacion = fechaCreacion;
}

public String getUsuarioCreacion() {
return usuarioCreacion;
}

public void setUsuarioCreacion(String usuarioCreacion) {
this.usuarioCreacion = usuarioCreacion;
}

public LocalDateTime getUltimaFechaModificacion() {
return ultimaFechaModificacion;
}

public void setUltimaFechaModificacion(LocalDateTime ultimaFechaModificacion) {
this.ultimaFechaModificacion = ultimaFechaModificacion;
}

public String getUltimoUsuarioModificacion() {
return ultimoUsuarioModificacion;
}

public void setUltimoUsuarioModificacion(String ultimoUsuarioModificacion) {
this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
}
}
