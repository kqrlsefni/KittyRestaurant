package KittyRestaurant.MsReserva.dto;

public class ReservaResponse<T> extends ResponseFormat{
    
     private Iterable<T> data;
    public Iterable<T> getData() {
        return data;
    }
    public void setData(Iterable<T> data) {
        this.data = data;
    }
    
    
    
     
     
}
