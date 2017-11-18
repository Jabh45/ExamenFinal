package pregunta1;

import java.awt.Color;

public class Finish implements AbstractFactoryFinish{
    protected Color color;
    protected float price;
    protected String description;
    
    public Color getColor() {
        return color;
    }
    
    public float getPrice() {
        return price;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String toString() {
        return  this.description + " | " + this.price;
    }
}
