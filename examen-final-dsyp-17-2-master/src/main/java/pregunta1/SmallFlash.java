package pregunta1;

public class SmallFlash extends Storage {
    private String description;
    
    public SmallFlash()
    {
        this.type = StorageType.Flash;
        this.size = StorageSize.Small;
        this.price = 500;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
