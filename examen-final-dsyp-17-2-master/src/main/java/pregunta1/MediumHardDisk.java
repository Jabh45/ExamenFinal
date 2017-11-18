package pregunta1;

public class MediumHardDisk extends Storage {
    private String description;
    
    public MediumHardDisk()
    {
        this.type = StorageType.HardDisk;
        this.size = StorageSize.Medium;
        this.price = 300;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
