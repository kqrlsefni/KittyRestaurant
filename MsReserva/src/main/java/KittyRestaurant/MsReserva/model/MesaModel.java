package KittyRestaurant.MsReserva.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mesa")
public class MesaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mesa")
    public int id_mesa;

    @Column(name="capacidad")    
    public int capacidad;

    @Column(name="estado")    
    public String estado;

    @Column(name="fecha_creacion")    
    public Date fecha_creacion;

    @Column(name="usuario_creacion")    
    public String usuario_creacion;

    @Column(name="fecha_ultima_modificacion")    
    public Date fecha_ultima_modificacion;

    @Column(name="usuario_ultima_modificacion")    
    public String usuario_ultima_modificacion;

    @Column(name="id_sede")
    public int id_sede;

    public int getId_mesa() {
        return id_mesa;
    }

    public void setIdMesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

     public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechacreacion() {
        return fecha_creacion;
    }

    public void setFechacreacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

     public String getUsuariocreacion() {
        return usuario_creacion;
    }

    public void setUsuariocreacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public Date getFechaultimamodificacion() {
        return fecha_ultima_modificacion;
    }

    public void setFechaultimamodficacion(Date fecha_ultima_modificacion) {
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
    }

    public String getUsuarioultimamodificacion() {
        return usuario_ultima_modificacion;
    }

    public void setUsuarioultimamodficacion(String usuario_ultima_modificacion) {
        this.usuario_ultima_modificacion = usuario_ultima_modificacion;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setIdsede(int id_sede) {
        this.id_sede = id_sede;
    }




}
