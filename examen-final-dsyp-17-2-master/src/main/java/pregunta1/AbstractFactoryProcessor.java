package pregunta1;

import java.awt.Color;

public interface AbstractFactoryProcessor {
	public ProcessorType getType();
    
    public ProcessorFrequency getFrequency();
    
    public float getPrice() ;
    
    public String toString();
}
