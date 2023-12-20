package KittyRestaurant.MsReserva.dto;



public class SedeDTO {
private int idSede;
private String nombre;
private String direccion;

public SedeDTO(
int idSede,
String nombre,
String direccion)
{
this.idSede = idSede;
this.nombre = nombre;
this.direccion = direccion;
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
}
