package KittyRestaurant.MsLogin.dto;

public class ClienteRequest {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String tipoDeDocumento;
    private String numeroDeDocumento;
    private String correo;
    private String fechaCreacion;
    private String usuarioCreacion;
    private String ultimaFechaModificacion;
    private String ultimoUsuarioModificacion;

    public ClienteRequest(
        int idCliente,
        String nombre,
        String apellido,
        String tipoDeDocumento,
        String numeroDeDocumento,
        String correo,
        String fechaCreacion,
        String usuarioCreacion,
        String ultimaFechaModificacion,
        String ultimoUsuarioModificacion)
        {
            this.idCliente = idCliente;
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoDeDocumento = tipoDeDocumento;
            this.numeroDeDocumento = numeroDeDocumento;
            this.correo = correo;
            this.fechaCreacion = fechaCreacion;
            this.usuarioCreacion = usuarioCreacion;
            this.ultimaFechaModificacion = ultimaFechaModificacion;
            this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
        }
            public int getIdCliente() {
                return idCliente;
            }
            
            public void setIdCliente(int idCliente) {
                this.idCliente = idCliente;
            }
            
            public String getNombre() {
                return nombre;
            }
            
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            
            public String getApellido() {
                return apellido;
            }
            
            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public String getTipoDeDocumento() {
                return tipoDeDocumento;
            }
                
            public void setTipoDeDocumento(String tipoDeDocumento) {
                this.tipoDeDocumento = tipoDeDocumento;
            }

            public String getNumeroDeDocumento() {
                return numeroDeDocumento;
            }
                
            public void setNumeroDeDocumento(String numeroDeDocumento) {
                this.numeroDeDocumento = numeroDeDocumento;
            }

            public String getCorreo() {
                return correo;
            }
                
            public void setCorreo(String correo) {
                this.correo = correo;
            }
            public String getFechaCreacion() {
                return fechaCreacion;
            }
                
            public void setFechaCreacion(String fechaCreacion) {
                this.fechaCreacion = fechaCreacion;
            }
                
            public String getUsuarioCreacion() {
                return usuarioCreacion;
            }
                
            public void setUsuarioCreacion(String usuarioCreacion) {
                this.usuarioCreacion = usuarioCreacion;
            }
                
            public String getUltimaFechaModificacion() {
                return ultimaFechaModificacion;
            }
                
            public void setUltimaFechaModificacion(String ultimaFechaModificacion) {
                this.ultimaFechaModificacion = ultimaFechaModificacion;
            }
                
            public String getUltimoUsuarioModificacion() {
                return ultimoUsuarioModificacion;
            }
                
            public void setUltimoUsuarioModificacion(String ultimoUsuarioModificacion) {
                this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
            }
}
