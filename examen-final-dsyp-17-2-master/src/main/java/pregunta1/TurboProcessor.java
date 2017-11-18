package pregunta1;

public class TurboProcessor extends Processor {
    private String description;
    
    public TurboProcessor()
    {
        this.type = ProcessorType.DualCore;
        this.frequency = ProcessorFrequency.Turbo;
        this.price = 490;
        this.description = String.format("Processor: %s %s", this.type.toString(), this.frequency.toString());
    }
    
    public String getDescription() {
        return description;
    }
}
