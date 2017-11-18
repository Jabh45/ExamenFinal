package pregunta1;

public class HugeHardDisk extends Storage {
    private String description;
    
    public HugeHardDisk()
    {
        this.type = StorageType.HardDisk;
        this.size = StorageSize.Huge;
        this.price = 450;
        this.description = String.format("Storage: %s %s", this.type.toString(), this.size.toString());
    }

    public String getDescription() {
        return description;
    }
}
