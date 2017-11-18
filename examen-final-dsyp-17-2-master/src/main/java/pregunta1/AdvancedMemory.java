package pregunta1;

public class AdvancedMemory extends Memory {
    private String description;
    
    public AdvancedMemory()
    {
        this.type = MemoryType.LPDDR3;
        this.size = MemorySize.Medium;
        this.frequency = MemorySpeed.Fast;
        this.price = 400;
        this.description = String.format("Memory: %s %s %s", this.type.toString(), this.size.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
