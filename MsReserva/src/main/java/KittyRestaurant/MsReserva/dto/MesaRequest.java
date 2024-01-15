package KittyRestaurant.MsReserva.dto;

import java.sql.Date;

public class MesaRequest {
    private int id_mesa;   
    private int capacidad;
    private String estado;
    private Date fecha_creacion;
    private String usuario_creacion;
    private Date fecha_ultima_modificacion;
    private String usuario_ultima_modificacion;
    private int id_sede;

    public MesaRequest(
     int id_mesa,   
     int capacidad,
     String estado,
     Date fecha_creacion,
     String usuario_creacion,
    Date fecha_ultima_modificacion,
    String usuario_ultima_modificacion,
    int id_sede
    )
    {
        this.setIdMesa(id_mesa);
        this.setCapacidad(capacidad);
        this.setEstado(estado);
        this.setFechacreacion(fecha_creacion);
        this.setUsuariocreacion(usuario_creacion);
        this.setFechaultimamodficacion(fecha_ultima_modificacion);
        this.setUsuarioultimamodficacion(usuario_ultima_modificacion);
        this.setIdSede(id_sede);

    }

    public int getIdMesa() {
        return id_mesa;
    }

    public void setIdMesa(int idMesa) {
        this.id_mesa= idMesa;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public Date getFechaCreacion(){
        return fecha_creacion;
    }

    public void setFechacreacion(Date fecha_creacion){
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuariocreacion(){
        return usuario_creacion;
    }

    public void setUsuariocreacion(String usuario_creacion){
        this.usuario_creacion = usuario_creacion;
    }

    public Date getFechaUltimaModificacion(){
        return fecha_ultima_modificacion;
    }

    public void setFechaultimamodficacion(Date fecha_ultima_modificacion){
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
    }

    public String getUsuarioultimamodificacion(){
        return usuario_ultima_modificacion;
    }

    public void setUsuarioultimamodficacion(String usuario_ultima_modificacion){
        this.usuario_ultima_modificacion = usuario_ultima_modificacion;
    }

    public int getIdsede(){
        return id_sede;
    }

    public void setIdSede(int idSede){
        this.id_sede = idSede;
    }

}
