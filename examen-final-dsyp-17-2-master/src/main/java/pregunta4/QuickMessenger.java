package pregunta4;

public class QuickMessenger implements Messaging {
    @Override
    public void send(String message) {
        System.out.println("Message '" + message + "' sent via e-mail");
    }
}
