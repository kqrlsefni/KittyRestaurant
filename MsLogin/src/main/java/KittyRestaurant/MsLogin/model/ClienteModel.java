package KittyRestaurant.MsLogin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdCliente")
    public int IdCliente;

    @Column(name="Nombre")
    public String Nombre;

    @Column(name="Apellido")
    public String Apellido;

    @Column(name="TipoDeDocumento")
    public String TipoDeDocumento;

    @Column(name="NumeroDeDocumento")
    public String NumeroDeDocumento;

    @Column(name="Correo")
    public String Correo;

    @Column(name="FechaCreacion")
    public String FechaCreacion ;

    @Column(name="UsuarioCreacion")
    public String UsuarioCreacion;

    @Column(name="UltimaFechaModificacion")
    public String UltimaFechaModificacion;

    @Column(name="UltimoUsuarioModificacion")
    public String UltimoUsuarioModificacion;

    public int getIdCliente(){
        return IdCliente;
    }

    public void setIdCliente(int IdCliente){
        this.IdCliente = IdCliente;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }

    public String getTipoDeDocumento(){
        return TipoDeDocumento;
    }

    public void setTipoDeDocumento(String TipoDeDocumento){
        this.TipoDeDocumento = TipoDeDocumento;
    }

    public String getNumeroDeDocumento(){
        return NumeroDeDocumento;
    }

    public void setNumeroDeDocumento(String NumeroDeDocumento){
        this.NumeroDeDocumento = NumeroDeDocumento;
    }

    public String getCorreo(){
        return Correo;
    }

    public void setCorreo(String Correo){
        this.Correo = Correo;
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
