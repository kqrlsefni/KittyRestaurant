package KittyRestaurant.MsPlatillo.dto;

public class PlatilloRequest {
    private int idPlatillo;
    private String Nombre;
    private String Descripcion;
    
    public PlatilloRequest(
        int idPlatillo,
        String Nombre,
        String Descripcion)
        {
            this.idPlatillo = idPlatillo;
            this.Nombre = Nombre;
            this.Descripcion = Descripcion;
        }
            public int getIdPlatillo() {
                return idPlatillo;
            }
            
            public void setIdPlatillo(int idPlatillo) {
                this.idPlatillo = idPlatillo;
            }
            
            public String getNombre() {
                return Nombre;
            }
            
            public void setNombre(String Nombre) {
                this.Nombre = Nombre;
            }

            public String getDescripcion() {
                return Descripcion;
            }
            
            public void setDescripcion(String Descripcion) {
                this.Descripcion = Descripcion;
            }
            
}
