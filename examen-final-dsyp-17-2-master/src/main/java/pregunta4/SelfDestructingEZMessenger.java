package pregunta4;

public class SelfDestructingEZMessenger extends EZMessenger {
    public void send(String message) {
        message = "☠" + message + "☠";
        super.send(message);
    }
}
