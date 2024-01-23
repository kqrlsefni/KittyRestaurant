package KittyRestaurant.MsVenta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class VentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdVenta")
    public int IdVenta;

    @Column(name="TipoComprobante")
    public String TipoComprobante;

    @Column(name="MontoPagar")
    public Double MontoPagar;

    @Column(name="NumeroDeDocumento")
    public String NumeroDeDocumento;

    @Column(name="Fecha")
    public String Fecha;

    @Column(name="MedioDePago")
    public String MedioDePago;

    @Column(name="FechaCreacion")
    public String FechaCreacion;

    @Column(name="UsuarioCreacion")
    public String UsuarioCreacion ;

    @Column(name="UltimaFechaModificacion")
    public String UltimaFechaModificacion;

    @Column(name="UltimoUsuarioModificacion")
    public String UltimoUsuarioModificacion;

    public int getIdVenta(){
        return IdVenta;
    }

    public void setIdVenta(int IdVenta){
        this.IdVenta = IdVenta;
    }

    public String getTipoComprobante(){
        return TipoComprobante;
    }

    public void setTipoComprobante(String TipoComprobante){
        this.TipoComprobante = TipoComprobante;
    }

    public Double getMontoPagar(){
        return MontoPagar;
    }

    public void setMontoPagar(Double MontoPagar){
        this.MontoPagar = MontoPagar;
    }

    public String getNumeroDeDocumento(){
        return NumeroDeDocumento;
    }

    public void setNumeroDeDocumento(String NumeroDeDocumento){
        this.NumeroDeDocumento = NumeroDeDocumento;
    }

    public String getFecha(){
        return Fecha;
    }

    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }

    public String getMedioDePago(){
        return MedioDePago;
    }

    public void setMedioDePago(String MedioDePago){
        this.MedioDePago = MedioDePago;
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
