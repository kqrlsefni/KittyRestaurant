package KittyRestaurant.MsLogin.dto;

public class UsuarioDTO {

    private int idUsuario;
    private String usuario;
    private String contraseña;
    private String rol;
    
    public UsuarioDTO(
        int idUsuario,
        String usuario,
        String contraseña,
        String rol)
        {
            this.idUsuario = idUsuario;
            this.usuario = usuario;
            this.contraseña = contraseña;
            this.rol = rol;
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
    
}
