package pregunta1;

public class Client {

    public static void main(String[] args) {
    	
        ConcretComputer basicComputer = new ConcretComputer(new WhiteFinish(), new SmallHardDisk(), new BasicProcessor(), new BasicMemory(), "Basic Computer");
        
        ConcretComputer officeComputer = new ConcretComputer(new WhiteFinish(), new MediumHardDisk(), new FastProcessor(), new AdvancedMemory(), "Office Computer");
        
        ConcretComputer developerComputer = new ConcretComputer(new BlackFinish(), new MediumHardDisk(), new FastProcessor(), new ProMemory(), "Developer Computer");
        
        ConcretComputer highEndComputer = new ConcretComputer(new BlackFinish(), new HugeFlash(), new HighEndProcessor(), new ProMemory(), "HighEnd Computer");
        
        ConcretComputer[] computers = {basicComputer, officeComputer, developerComputer, highEndComputer};
        for (ConcretComputer computer : computers) {
        	System.out.println(computer.getType() + ":\n" + computer.getDescription());
        	System.out.println("\n**********************\n");
        }
    
    }
    
    
}
