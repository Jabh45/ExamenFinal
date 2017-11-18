package pregunta2;

public class TwitterSharer implements Sharing {
    @Override
    public void share(String message) {
        System.out.println("Message '" + message + "' shared on Twitter");
    }
}
