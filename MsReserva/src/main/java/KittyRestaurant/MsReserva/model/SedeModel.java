package KittyRestaurant.MsReserva.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sede")
public class SedeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSede")
    public int IdSede;

    @Column(name="Nombre")
    public String Nombre;

    @Column(name="Direcion")
    public String Direccion;

    @Column(name="FechaCreacion")
    public String FechaCreacion;

    @Column(name="UsuarioCreacion")
    public String UsuarioCreacion ;

    @Column(name="UltimaFechaModificacion")
    public String UltimaFechaModificacion;

    @Column(name="UltimoUsuarioModificacion")
    public String UltimoUsuarioModificacion;

    public int getIdSede(){
        return IdSede;
    }

    public void setIdSede(int IdSede){
        this.IdSede = IdSede;
    }

    public String getNombreSede(){
        return Nombre;
    }

    public void setNombreSede(String Nombre){
        this.Nombre = Nombre;
    }

    public String getDireccionSede(){
        return Direccion;
    }

    public void setDireccionSede(String Direccion){
        this.Direccion = Direccion;
    }

    public String getFechaCreacionSede(){
        return FechaCreacion;
    }

    public void setFechaCreacionSede(String FechaCreacion){
        this.FechaCreacion = FechaCreacion;
    }

    public String getUsuarioCreacionSede(){
        return UsuarioCreacion;
    }

    public void setUsuarioCreacionSede(String UsuarioCreacion){
        this.UsuarioCreacion = UsuarioCreacion;
    }

    public String getUltimaFechaModificacionSede(){
        return UltimaFechaModificacion;
    }

    public void setUltimaFechaModificacionSede(String UltimaFechaModificacion){
        this.UltimaFechaModificacion = UltimaFechaModificacion;
    }

    public String getUltimoUsuarioModificacionSede(){
        return UltimoUsuarioModificacion;
    }

    public void setUltimoUsuarioModificacionSede(String UltimoUsuarioModificacion){
        this.UltimoUsuarioModificacion = UltimoUsuarioModificacion;
    }
}
