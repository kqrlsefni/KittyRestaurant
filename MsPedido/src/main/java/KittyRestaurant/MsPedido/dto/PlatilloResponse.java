package KittyRestaurant.MsPedido.dto;

import com.fasterxml.jackson.databind.JsonNode;

public class PlatilloResponse extends ResponseFormat {
    private JsonNode data;

    public JsonNode getData() {
        return data;
    }

    public void setData(JsonNode data) {
        this.data = data;
    } 
}
