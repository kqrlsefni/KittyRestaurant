package KittyRestaurant.MsReserva.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class ReservaModel {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reserva")
    public int idReserva;

    @Column(name="cantidad_persona")    
    public int cantidadPersona;

    @Column(name="fecha_hora")
    public String fechaHora;

    @Column(name="descripcion")
    public String descripcion;

    @Column(name="estado")
    public String estado;

    @Column(name="numero_contacto")
    public String numeroContacto;

    @Column(name="nombre_contacto")
    public String nombreContacto;

    @Column(name="usuario_creacion")
    public String usuarioCreacion;

    @Column(name="fecha_creacion")
    public String fechaCreacion;

    @Column(name="usuario_ultima_modificacion")
    public String usuarioUltimaModificacion;
    
    @Column(name="fecha_ultima_modificacion")
    public String fechaUltimaModificacion;

    @Column(name="id_mesa")
    public int idMesa;

    public ReservaModel(int idReserva, int cantidadPersona, String fechaHora, String descripcion, String estado,
            String numeroContacto, String nombreContacto, String usuarioCreacion, String fechaCreacion,
            String usuarioUltimaModificacion, String fechaUltimaModificacion, int idMesa) {
        this.idReserva = idReserva;
        this.cantidadPersona = cantidadPersona;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.estado = estado;
        this.numeroContacto = numeroContacto;
        this.nombreContacto = nombreContacto;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.usuarioUltimaModificacion = usuarioUltimaModificacion;
        this.fechaUltimaModificacion = fechaUltimaModificacion;
        this.idMesa = idMesa;
    }

    public ReservaModel() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioUltimaModificacion() {
        return usuarioUltimaModificacion;
    }

    public void setUsuarioUltimaModificacion(String usuarioUltimaModificacion) {
        this.usuarioUltimaModificacion = usuarioUltimaModificacion;
    }

    public String getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(String fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    

    

}