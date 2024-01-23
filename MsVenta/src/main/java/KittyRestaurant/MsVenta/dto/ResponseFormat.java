package KittyRestaurant.MsVenta.dto;

public class ResponseFormat {
    
    private boolean status;
    private String httpStatusCode;
    private String message;
    private String messages;
    
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getHttpStatusCode() {
        return httpStatusCode;
    }
    public void setHttpStatusCode(String code) {
        this.httpStatusCode = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessages() {
        return messages;
    }
    public void setMessages(String messages) {
        this.messages = messages;
    }
}
