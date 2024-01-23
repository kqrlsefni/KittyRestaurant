package KittyRestaurant.MsPlatillo.dto;

public class PlatilloDiarioRequest {
    private int idPlatilloDiario;
    private String Nombre;
    private Double Precio;
    private int CantidadDisponible;
    private String Categoria;
    private String Fecha;
    private String fechaCreacion;
    private String usuarioCreacion;
    private String ultimaFechaModificacion;
    private String ultimoUsuarioModificacion;
    
    public PlatilloDiarioRequest(
        int idPlatilloDiario,
        String Nombre,
        Double Precio,
        int CantidadDisponible,
        String Categoria,
        String Fecha,
        String fechaCreacion,
        String usuarioCreacion,
        String ultimaFechaModificacion,
        String ultimoUsuarioModificacion)
        {
            this.idPlatilloDiario = idPlatilloDiario;
            this.Nombre = Nombre;
            this.Precio = Precio;
            this.CantidadDisponible = CantidadDisponible;
            this.Categoria = Categoria;
            this.Fecha = Fecha;
            this.fechaCreacion = fechaCreacion;
            this.usuarioCreacion = usuarioCreacion;
            this.ultimaFechaModificacion = ultimaFechaModificacion;
            this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
        }
            public int getIdPlatilloDiario() {
                return idPlatilloDiario;
            }
            
            public void setIdPlatilloDiario(int idPlatilloDiario) {
                this.idPlatilloDiario = idPlatilloDiario;
            }
            
            public String getNombre() {
                return Nombre;
            }
            
            public void setNombre(String Nombre) {
                this.Nombre = Nombre;
            }

            public Double getPrecio() {
                return Precio;
            }
            
            public void setPrecio(Double Precio) {
                this.Precio = Precio;
            }

            public int getCantidadDisponible() {
                return CantidadDisponible;
            }
            
            public void setCantidadDisponible(int CantidadDisponible) {
                this.CantidadDisponible = CantidadDisponible;
            }

            public String getCategoria() {
                return Categoria;
            }
            
            public void setCategoria(String Categoria) {
                this.Categoria = Categoria;
            }

            public String getFecha() {
                return Fecha;
            }
            
            public void setFecha(String Fecha) {
                this.Fecha = Fecha;
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
