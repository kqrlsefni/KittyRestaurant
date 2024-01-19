package KittyRestaurant.MsPedido.dto;

import java.sql.Date;

public class PlatilloDTO {
    private int idPlatillo;   
    private String nombre;
    private Double precio;
    private int cantidadDisponible;
    private String categoria;
    private Date fechaCreacion;
    private String usuarioCreacion;
    private Date ultimaFechaModificacion;
    private String ultimoUsuarioModificacion;

    public PlatilloDTO(
        int idPlatillo,   
     String nombre,
      Double precio,
     int cantidadDisponible,
     String categoria,
     Date fechaCreacion,
     String usuarioCreacion,
     Date ultimaFechaModificacion,
     String ultimoUsuarioModificacion
    ){
        this.setIdPlatillo(idPlatillo);
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setCantidadDisponible(cantidadDisponible);
        this.setCategoria(categoria);
        this.setFechaCreacion(fechaCreacion);
        this.setUsuariocreacion(usuarioCreacion);
        this.setUltimaFechaModificacion(ultimaFechaModificacion);
        this.setUltimoUsuarioModificacion(ultimoUsuarioModificacion);
    }

    public int getIdPlatillo() {
        return getIdPlatillo();
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCatidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuariocreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getUltimaFechaModificacion() {
        return ultimaFechaModificacion;
    }

    public void setUltimaFechaModificacion(Date ultimaFechaModificacion) {
        this.ultimaFechaModificacion = ultimaFechaModificacion;
    }

    public String getUltimoUsuarioModificacio() {
        return ultimoUsuarioModificacion;
    }

    public void setUltimoUsuarioModificacion(String ultimoUsuarioModificacion) {
        this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
    }


    
}
