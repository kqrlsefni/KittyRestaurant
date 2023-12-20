package KittyRestaurant.MsReserva.dto;

public class ReservaRequest {

    private int idReserva;   
    private int cantidadPersona;
    private String fechaHora;
    private String descripcion;
    private String estado;
    private String numeroContacto;
    private String nombreContacto;
    private String usuarioCreacion;
    private String fechaCreacion;
    private String usuarioUltimaModificacion;
    private String fechaUltimaModificacion;
    private int idMesa;
    public ReservaRequest(
            int idReserva,
            int cantidadPersona,
            String fechaHora,
            String descripcion,
            String estado,
            String numeroContacto,
            String nombreContacto, 
            String usuarioCreacion, 
            String fechaCreacion,
            String usuarioUltimaModificacion, 
            String fechaUltimaModificacion,
            int idMesa) 
    {
            this.setIdReserva(idReserva);
            this.setCantidadPersona(cantidadPersona);
            this.setFechaHora(fechaHora);
            this.setDescripcion(descripcion);
            this.setEstado(estado);
            this.setNumeroContacto(numeroContacto);
            this.setNombreContacto(nombreContacto);
            this.setUsuarioCreacion(usuarioCreacion);
            this.setFechaCreacion(fechaCreacion);
            this.setUsuarioUltimaModificacion(usuarioUltimaModificacion);
            this.setFechaUltimaModificacion(fechaUltimaModificacion);
            this.setIdMesa(idMesa);
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
