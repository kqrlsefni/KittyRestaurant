package KittyRestaurant.MsLogin.dto;

public class UsuarioRequest {

    private int idUsuario;
    private String usuario;
    private String contraseña;
    private String rol;
    private String fechaCreacion;
    private String usuarioCreacion;
    private String ultimaFechaModificacion;
    private String ultimoUsuarioModificacion;
    
    public UsuarioRequest(
        int idUsuario,
        String usuario,
        String contraseña,
        String rol,
        String fechaCreacion,
        String usuarioCreacion,
        String ultimaFechaModificacion,
        String ultimoUsuarioModificacion)
        {
            this.idUsuario = idUsuario;
            this.usuario = usuario;
            this.contraseña = contraseña;
            this.rol = rol;
            this.fechaCreacion = fechaCreacion;
            this.usuarioCreacion = usuarioCreacion;
            this.ultimaFechaModificacion = ultimaFechaModificacion;
            this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
        }
            public int getIdUsuario() {
                return idUsuario;
            }
            
            public void setIdUsuario(int idUsuario) {
                this.idUsuario = idUsuario;
            }
            
            public String getUsuario() {
                return usuario;
            }
            
            public void setUsuario(String usuario) {
                this.usuario = usuario;
            }
            
            public String getContraseña() {
                return contraseña;
            }
            
            public void setContraseña(String contraseña) {
                this.contraseña = contraseña;
            }

            public String getRol() {
                return rol;
            }
                
            public void setRol(String rol) {
                this.rol = rol;
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
