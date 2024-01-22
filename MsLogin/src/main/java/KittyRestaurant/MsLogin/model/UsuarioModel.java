package KittyRestaurant.MsLogin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdUsuario")
    public int IdUsuario;

    @Column(name="usuario")
    public String usuario;

    @Column(name="contraseña")
    public String contraseña;

    @Column(name="rol")
    public String rol;

    @Column(name="FechaCreacion")
    public String FechaCreacion ;

    @Column(name="UsuarioCreacion")
    public String UsuarioCreacion;

    @Column(name="UltimaFechaModificacion")
    public String UltimaFechaModificacion;

    @Column(name="UltimoUsuarioModificacion")
    public String UltimoUsuarioModificacion;

    public int getIdUsuario(){
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario){
        this.IdUsuario = IdUsuario;
    }

    public String getusuario(){
        return usuario;
    }

    public void setusuario(String usuario){
        this.usuario = usuario;
    }

    public String getcontraseña(){
        return contraseña;
    }

    public void setcontraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String getrol(){
        return rol;
    }

    public void setrol(String rol){
        this.rol = rol;
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
