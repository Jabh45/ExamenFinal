package pregunta1;

public interface FactoryComputer {
	    
	public void CreateFinish(Finish finish);
	public void CreateMemory(Memory memory);
	public void CreateProcessor(Processor processor);
	public void CreateStorage(Storage storage);
	
	public float getTotalPrice();
    public String getDescription();
        
}
