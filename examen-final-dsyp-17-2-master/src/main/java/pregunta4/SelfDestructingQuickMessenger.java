package pregunta4;

public class SelfDestructingQuickMessenger extends QuickMessenger {
    public void send(String message) {
        message = "☠" + message + "☠";
        super.send(message);
    }
}
