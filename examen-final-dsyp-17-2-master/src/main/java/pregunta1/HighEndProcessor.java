package pregunta1;

public class HighEndProcessor extends Processor {
    private String description;
    
    public HighEndProcessor()
    {
        this.type = ProcessorType.QuadCore;
        this.frequency = ProcessorFrequency.Turbo;
        this.price = 900;
        this.description = String.format("Processor: %s %s", this.type.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
