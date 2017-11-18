package pregunta1;

public class ConcretComputer implements FactoryComputer{
    private Finish finish;
    private Storage storage;
    private Processor processor;
    private Memory memory;
    private String type;
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    public ConcretComputer(Finish finish, Storage storage, Processor processor, Memory memory, String type)
    {
    	CreateFinish( finish);
    	CreateMemory( memory);
    	CreateProcessor( processor);
    	CreateStorage( storage);
    	setType(type);
    }
    
    public float getTotalPrice()
    {
    	return this.finish.price + this.storage.price + this.processor.price + this.memory.price;
    }
    
    public String getDescription()
    {
    	return String.format("Your configuration => \n%s \n%s \n%s \n%s \nTotal: $%.2f", this.finish.toString(), this.storage.toString(), this.processor.toString(), this.memory.toString(), this.getTotalPrice());
    }

	@Override
	public void CreateFinish(Finish finish) {
		this.finish=finish;
		
	}

	@Override
	public void CreateMemory(Memory memory) {
		this.memory=memory;
	}

	@Override
	public void CreateProcessor(Processor processor) {
		this.processor=processor;
	}

	@Override
	public void CreateStorage(Storage storage) {
		this.storage=storage;
	}
    
    
}
