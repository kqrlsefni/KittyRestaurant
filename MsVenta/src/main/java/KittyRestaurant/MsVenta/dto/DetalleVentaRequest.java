package KittyRestaurant.MsVenta.dto;

public class DetalleVentaRequest {
    private int idDetalleVenta;
    private int idVenta;
    private int Cantidad;
    private Double Precio;
    private int idPedido;
    private int idPlatilloDiario;
    
    
    public DetalleVentaRequest(
        int idDetalleVenta,
        int idVenta,
        int Cantidad,
        Double Precio,
        int idPedido,
        int idPlatilloDiario)
        {
            this.idDetalleVenta = idDetalleVenta;
            this.idVenta = idVenta;
            this.Cantidad = Cantidad;
            this.Precio = Precio;
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

            public int getCantidad() {
                return Cantidad;
            }
            
            public void setCantidad(int Cantidad) {
                this.Cantidad = Cantidad;
            }

            public Double getPrecio() {
                return Precio;
            }
            
            public void setPrecio(Double Precio) {
                this.Precio = Precio;
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
