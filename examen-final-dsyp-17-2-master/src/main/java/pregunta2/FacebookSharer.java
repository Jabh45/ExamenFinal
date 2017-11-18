package pregunta2;

public class FacebookSharer implements Sharing {
    @Override
    public void share(String message) {
        System.out.println("Message '" + message + "' shared on Facebook");
    }
}
