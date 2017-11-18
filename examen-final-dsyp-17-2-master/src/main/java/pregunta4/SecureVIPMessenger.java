package pregunta4;

public class SecureVIPMessenger extends VIPMessenger {
    private String encrypt(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
    }
    
    public void send(String message) {
        message = encrypt(message);
        super.send(message);
    }
}
