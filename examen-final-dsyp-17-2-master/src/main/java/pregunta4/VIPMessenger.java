package pregunta4;

public class VIPMessenger implements Messaging {
    @Override
    public void send(String message) {
        System.out.println("Message '" + message + "' sent via P2P");
    }
}
