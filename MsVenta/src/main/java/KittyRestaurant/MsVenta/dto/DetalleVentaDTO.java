package KittyRestaurant.MsVenta.dto;

public class DetalleVentaDTO {
    private int idDetalleVenta;
    private int idVenta;
    private int idPedido;
    private int idPlatilloDiario;
    
    public DetalleVentaDTO(
        int idDetalleVenta,
        int idVenta,
        int idPedido,
        int idPlatilloDiario)
        {
            this.idDetalleVenta = idDetalleVenta;
            this.idVenta = idVenta;
            this.idPedido = idPedido;
            this.idPlatilloDiario = idPlatilloDiario;
        }
            public int getIdDetalleVenta() {
                return idDetalleVenta;
            }
            
            public void setIdDetalleVenta(int idDetalleVenta) {
                this.idDetalleVenta = idDetalleVenta;
            }

            public int getIdVenta() {
                return idVenta;
            }
            
            public void setIdVenta(int idVenta) {
                this.idVenta = idVenta;
            }
            

            public int getIdPedido() {
                return idPedido;
            }
            
            public void setIdPedido(int idPedido) {
                this.idPedido = idPedido;
            }

            public int getIdPlatilloDiario() {
                return idPlatilloDiario;
            }
            
            public void setIdPlatilloDiario(int idPlatilloDiario) {
                this.idPlatilloDiario = idPlatilloDiario;
            }
}
