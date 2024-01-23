package KittyRestaurant.MsPlatillo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="platillodiario")

public class PlatilloDiarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdPlatilloDiario")
    public int IdPlatilloDiario;

    @Column(name="Nombre")
    public String Nombre;

    @Column(name="Precio")
    public Double Precio;

    @Column(name="CantidadDisponible")
    public int CantidadDisponible;

    @Column(name="Categoria")
    public String Categoria;

    @Column(name="Fecha")
    public String Fecha;

    @Column(name="FechaCreacion")
    public String FechaCreacion ;

    @Column(name="UsuarioCreacion")
    public String UsuarioCreacion;

    @Column(name="UltimaFechaModificacion")
    public String UltimaFechaModificacion;

    @Column(name="UltimoUsuarioModificacion")
    public String UltimoUsuarioModificacion;

    public int getIdPlatilloDiario(){
        return IdPlatilloDiario;
    }

    public void setIdPlatilloDiario(int IdPlatilloDiario){
        this.IdPlatilloDiario = IdPlatilloDiario;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public Double getPrecio(){
        return Precio;
    }

    public void setPrecio(Double Precio){
        this.Precio = Precio;
    }

    public int getCantidadDisponible(){
        return CantidadDisponible;
    }

    public void setCantidadDisponible(int CantidadDisponible){
        this.CantidadDisponible = CantidadDisponible;
    }

    public String getCategoria(){
        return Categoria;
    }

    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }

    public String getFecha(){
        return Fecha;
    }

    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }

    public String getFechaCreacion(){
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion){
        this.FechaCreacion = FechaCreacion;
    }

    public String getUsuarioCreacion(){
        return UsuarioCreacion;
    }

    public void setUsuarioCreacion(String UsuarioCreacion){
        this.UsuarioCreacion = UsuarioCreacion;
    }

    public String getUltimaFechaModificacion(){
        return UltimaFechaModificacion;
    }

    public void setUltimaFechaModificacion(String UltimaFechaModificacion){
        this.UltimaFechaModificacion = UltimaFechaModificacion;
    }

    public String getUltimoUsuarioModificacion(){
        return UltimoUsuarioModificacion;
    }

    public void setUltimoUsuarioModificacion(String UltimoUsuarioModificacion){
        this.UltimoUsuarioModificacion = UltimoUsuarioModificacion;
    }
}
