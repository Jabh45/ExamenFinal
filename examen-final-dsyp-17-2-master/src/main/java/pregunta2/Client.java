package pregunta2;

public class Client {

    public static void main(String[] args) {
        Sharer sharer = new Sharer();
        sharer.share("Mastering design patterns", SharerType.Facebook);
        sharer.shareEveryWhere("I'll receive my Master's degree from UNMSM very soon");
    }
}
