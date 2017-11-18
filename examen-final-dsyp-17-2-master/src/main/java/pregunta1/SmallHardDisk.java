package pregunta1;

public class SmallHardDisk extends Storage {
    private String description;
    
    public SmallHardDisk()
    {
        this.type = StorageType.HardDisk;
        this.size = StorageSize.Small;
        this.price = 100;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
