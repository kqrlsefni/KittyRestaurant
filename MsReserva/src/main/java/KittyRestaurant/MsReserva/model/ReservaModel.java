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

    

    

}