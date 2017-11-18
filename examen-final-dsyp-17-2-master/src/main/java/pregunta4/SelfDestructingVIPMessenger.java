package pregunta4;

public class SelfDestructingVIPMessenger extends VIPMessenger {
    public void send(String message) {
        message = "☠" + message + "☠";
        super.send(message);
    }
}
