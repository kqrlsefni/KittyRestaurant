package KittyRestaurant.MsVenta.dto;

public class VentaRequest {
    private int idVenta;
    private String TipoComprobante;
    private Double MontoPagar;
    private String NumeroDeDocumento;
    private String Fecha;
    private String MedioDePago;
    private String fechaCreacion;
    private String usuarioCreacion;
    private String ultimaFechaModificacion;
    private String ultimoUsuarioModificacion;
    
    public VentaRequest(
        int idVenta,
        String TipoComprobante,
        Double MontoPagar,
        String NumeroDeDocumento,
        String Fecha,
        String MedioDePago,
        String fechaCreacion,
        String usuarioCreacion,
        String ultimaFechaModificacion,
        String ultimoUsuarioModificacion)
        {
            this.idVenta = idVenta;
            this.TipoComprobante = TipoComprobante;
            this.MontoPagar = MontoPagar;
            this.NumeroDeDocumento = NumeroDeDocumento;
            this.Fecha = Fecha;
            this.MedioDePago = MedioDePago;
            this.fechaCreacion = fechaCreacion;
            this.usuarioCreacion = usuarioCreacion;
            this.ultimaFechaModificacion = ultimaFechaModificacion;
            this.ultimoUsuarioModificacion = ultimoUsuarioModificacion;
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
