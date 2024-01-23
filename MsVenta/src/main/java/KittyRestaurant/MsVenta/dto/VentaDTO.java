package KittyRestaurant.MsVenta.dto;

public class VentaDTO {
    private int idVenta;
    private String TipoComprobante;
    private Double MontoPagar;
    private String NumeroDeDocumento;
    private String Fecha;
    private String MedioDePago;
    
    public VentaDTO(
        int idVenta,
        String TipoComprobante,
        Double MontoPagar,
        String NumeroDeDocumento,
        String Fecha,
        String MedioDePago)
        {
            this.idVenta = idVenta;
            this.TipoComprobante = TipoComprobante;
            this.MontoPagar = MontoPagar;
            this.NumeroDeDocumento = NumeroDeDocumento;
            this.Fecha = Fecha;
            this.MedioDePago = MedioDePago;
        }
            public int getIdVenta() {
                return idVenta;
            }
            
            public void setIdVenta(int idVenta) {
                this.idVenta = idVenta;
            }
            
            public String getTipoComprobante() {
                return TipoComprobante;
            }
            
            public void setTipoComprobante(String TipoComprobante) {
                this.TipoComprobante = TipoComprobante;
            }

            public Double getMontoPagar() {
                return MontoPagar;
            }
            
            public void setMontoPagar(Double MontoPagar) {
                this.MontoPagar = MontoPagar;
            }

            public String getNumeroDeDocumento() {
                return NumeroDeDocumento;
            }
            
            public void setNumeroDeDocumento(String NumeroDeDocumento) {
                this.NumeroDeDocumento = NumeroDeDocumento;
            }

            public String getFecha() {
                return Fecha;
            }
            
            public void setFecha(String Fecha) {
                this.Fecha = Fecha;
            }

            public String getMedioDePago() {
                return MedioDePago;
            }
            
            public void setMedioDePago(String MedioDePago) {
                this.MedioDePago = MedioDePago;
            }

            
}
