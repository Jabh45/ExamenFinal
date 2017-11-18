package pregunta1;

public class ProMemory extends Memory {
    private String description;
    
    public ProMemory()
    {
        this.type = MemoryType.LPDDR3;
        this.size = MemorySize.Pro;
        this.frequency = MemorySpeed.Fast;
        this.price = 600;
        this.description = String.format("Memory: %s %s %s", this.type.toString(), this.size.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
