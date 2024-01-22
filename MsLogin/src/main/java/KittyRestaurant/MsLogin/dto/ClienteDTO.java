package KittyRestaurant.MsLogin.dto;

public class ClienteDTO {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String tipoDeDocumento;
    private String numeroDeDocumento;
    private String correo;

    public ClienteDTO(
        int idCliente,
        String nombre,
        String apellido,
        String tipoDeDocumento,
        String numeroDeDocumento,
        String correo)
        {
            this.idCliente = idCliente;
            this.nombre = nombre;
            this.apellido = apellido;
            this.tipoDeDocumento = tipoDeDocumento;
            this.numeroDeDocumento = numeroDeDocumento;
            this.correo = correo;
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
}
