package pregunta1;

public class FastProcessor extends Processor {
    private String description;
    
    public FastProcessor()
    {
        this.type = ProcessorType.DualCore;
        this.frequency = ProcessorFrequency.Fast;
        this.price = 320;
        this.description = String.format("Processor: %s %s", this.type.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
