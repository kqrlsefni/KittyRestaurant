package KittyRestaurant.MsPedido.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Platillo")
public class PlatilloModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPlatillo")
    public int idPlatillo;

    @Column(name="nombre")    
    public String nombre;

    @Column(name="precio")    
    public Double precio;

    @Column(name="cantidadDisponible")    
    public int cantidadDisponible;

    @Column(name="categoria")    
    public String categoria;

    @Column(name="fechaCreacion")    
    public Date fechaCreacion;

    @Column(name="usuarioCreacion")    
    public String usuarioCreacion;
    
    @Column(name="ultimaFechaModificacion")    
    public Date ultimaFechaModificacion;
    
    @Column(name="ultimoUsuarioModificacion")    
    public String ultimoUsuarioModificacion;

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
