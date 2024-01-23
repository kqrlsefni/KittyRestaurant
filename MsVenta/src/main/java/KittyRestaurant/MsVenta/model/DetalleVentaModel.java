package KittyRestaurant.MsVenta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalleventa")
public class DetalleVentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdDetalleVenta")
    public int IdDetalleVenta;

    @Column(name="IdVenta")
    public int IdVenta;

    @Column(name="Cantidad")
    public int Cantidad;

    @Column(name="Precio")
    public Double Precio;

    @Column(name="IdPedido")
    public int IdPedido;

    @Column(name="IdPlatilloDiario")
    public int IdPlatilloDiario;

    public int getIdDetalleVenta(){
        return IdDetalleVenta;
    }

    public void setIdDetalleVenta(int IdDetalleVenta){
        this.IdDetalleVenta = IdDetalleVenta;
    }

    public int getIdVenta(){
        return IdVenta;
    }

    public void setIdVenta(int IdVenta){
        this.IdVenta = IdVenta;
    }

    public int getCantidad(){
        return Cantidad;
    }

    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }

    public Double getPrecio(){
        return Precio;
    }

    public void setPrecio(Double Precio){
        this.Precio = Precio;
    }

    public int getIdPedido(){
        return IdPedido;
    }

    public void setIdPedido(int IdPedido){
        this.IdPedido = IdPedido;
    }

    public int getIdPlatilloDiario(){
        return IdPlatilloDiario;
    }

    public void setIdPlatilloDiario(int IdPlatilloDiario){
        this.IdPlatilloDiario = IdPlatilloDiario;
    }
}

