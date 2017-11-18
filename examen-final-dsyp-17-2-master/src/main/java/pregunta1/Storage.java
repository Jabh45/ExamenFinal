package pregunta1;

public class Storage implements AbstractFactoryStorage{
    protected StorageType type;
    protected StorageSize size;
    protected float price;
    
    public StorageType getType() {
        return type;
    }
    
    public StorageSize getSize() {
        return size;
    }
    
    public float getPrice() {
        return price;
    }
    
    public String toString() {
        return this.type.toString() + " | " + this.size.toString() + " | " + this.price;
    }
}
