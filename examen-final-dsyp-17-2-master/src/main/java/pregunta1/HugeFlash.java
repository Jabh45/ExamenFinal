package pregunta1;

public class HugeFlash extends Storage {
    private String description;
    
    public HugeFlash()
    {
        this.type = StorageType.Flash;
        this.size = StorageSize.Huge;
        this.price = 900;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
