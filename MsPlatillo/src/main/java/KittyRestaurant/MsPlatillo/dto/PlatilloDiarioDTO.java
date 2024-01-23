package KittyRestaurant.MsPlatillo.dto;

public class PlatilloDiarioDTO {
    private int idPlatilloDiario;
    private String Nombre;
    private Double Precio;
    private int CantidadDisponible;
    private String Categoria;
    private String Fecha;
    
    public PlatilloDiarioDTO(
        int idPlatilloDiario,
        String Nombre,
        Double Precio,
        int CantidadDisponible,
        String Categoria,
        String Fecha)
        {
            this.idPlatilloDiario = idPlatilloDiario;
            this.Nombre = Nombre;
            this.Precio = Precio;
            this.CantidadDisponible = CantidadDisponible;
            this.Categoria = Categoria;
            this.Fecha = Fecha;
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

            
}
