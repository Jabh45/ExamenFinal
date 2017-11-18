package pregunta1;

import java.awt.Color;

public interface AbstractFactoryStorage {
	public StorageType getType();
    
    public StorageSize getSize();
    
    public float getPrice();
    
    public String toString();
}
