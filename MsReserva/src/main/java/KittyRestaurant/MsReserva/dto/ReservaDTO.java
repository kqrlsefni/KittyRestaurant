package KittyRestaurant.MsReserva.dto;

public class ReservaDTO {
    private int idReserva;   
    private int cantidadPersona;
    private String fechaHora;
    private String descripcion;
    private String estado;
    private String numeroContacto;
    private String nombreContacto;

    public ReservaDTO(
            int idReserva,
            int cantidadPersona,
            String fechaHora,
            String descripcion,
            String estado,
            String numeroContacto,
            String nombreContacto) 
    {
            this.setIdReserva(idReserva);
            this.setCantidadPersona(cantidadPersona);
            this.setFechaHora(fechaHora);
            this.setDescripcion(descripcion);
            this.setEstado(estado);
            this.setNumeroContacto(numeroContacto);
            this.setNombreContacto(nombreContacto);
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
}
