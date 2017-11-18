package pregunta1;

import java.awt.Color;

public interface AbstractFactoryMemory {
	public MemoryType getType() ;

    public MemorySize getSize() ;

    public MemorySpeed getFrequency();

    public float getPrice() ;
    
    public String toString();
}
