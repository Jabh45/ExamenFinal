package pregunta4;

public class Client {

    public static void main(String[] args) {
        String message = "Hello";
        
        QuickMessenger quickMessenger = new QuickMessenger();
        quickMessenger.send(message);
        
        SecureQuickMessenger secureQuickMessenger = new SecureQuickMessenger();
        secureQuickMessenger.send(message);
        
        SelfDestructingQuickMessenger selfDestructingQuickMessenger = new SelfDestructingQuickMessenger();
        selfDestructingQuickMessenger.send(message);
        
        VIPMessenger vipMessenger = new VIPMessenger();
        vipMessenger.send(message);
        
        SecureVIPMessenger secureVIPMessenger = new SecureVIPMessenger();
        secureVIPMessenger.send(message);
        
        SelfDestructingVIPMessenger selfDestructingVIPMessenger = new SelfDestructingVIPMessenger();
        selfDestructingVIPMessenger.send(message);
        
        EZMessenger ezMessenger = new EZMessenger();
        ezMessenger.send(message);
        
        SecureEZMessenger secureEZMessenger = new SecureEZMessenger();
        secureEZMessenger.send(message);
        
        SelfDestructingEZMessenger selfDestructingEZMessenger = new SelfDestructingEZMessenger();
        selfDestructingEZMessenger.send(message);
    }
}
