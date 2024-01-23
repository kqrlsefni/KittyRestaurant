package KittyRestaurant.MsPlatillo.dto;

public class PlatilloDiarioResponse<T> extends ResponseFormat {

    private Iterable<T> data;

    public Iterable<T> getData() {
        return data;
    }

    public void setData(Iterable<T> data) {
        this.data = data;
    }
}
