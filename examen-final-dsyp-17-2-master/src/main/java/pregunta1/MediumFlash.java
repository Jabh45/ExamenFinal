package pregunta1;

public class MediumFlash extends Storage {
    private String description;
    
    public MediumFlash()
    {
        this.type = StorageType.Flash;
        this.size = StorageSize.Medium;
        this.price = 650;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
