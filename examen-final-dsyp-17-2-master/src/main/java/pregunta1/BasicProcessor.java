package pregunta1;

public class BasicProcessor extends Processor {
    private String description;
    
    public BasicProcessor()
    {
        this.type = ProcessorType.DualCore;
        this.frequency = ProcessorFrequency.Low;
        this.price = 250;
        this.description = String.format("Processor: %s %s", this.type.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
