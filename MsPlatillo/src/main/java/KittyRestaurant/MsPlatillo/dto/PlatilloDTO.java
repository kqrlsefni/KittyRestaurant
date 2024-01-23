package KittyRestaurant.MsPlatillo.dto;

public class PlatilloDTO {
    private int idPlatillo;
    private String Nombre;
    
    public PlatilloDTO(
        int idPlatillo,
        String Nombre)
        {
            this.idPlatillo = idPlatillo;
            this.Nombre = Nombre;
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
            
}
