package pregunta3;

public class Client {

    public static void main(String[] args) {
    	 
        int[] numbers = { 1, 5, 7, 78, 9, 2, 24, 38, 78, 91, 96, 4, 6, 17, 101, 24, 38, 47, 37, 148, 2, 589};
        
        Duplicate duplicate = new Duplicate();
        for (ComplexityType complexityType : ComplexityType.values()) {
            switch(complexityType) {
                case Lineal: 
                    duplicate.setStrategy(new StrategyLineal());
                    break;
                case Cuadratic: 
                	duplicate.setStrategy(new StrategyCuadratic());
                    break;
                case Exponential: 
                	duplicate.setStrategy(new StrategyExponential());
                     break;
            }
            System.out.println(duplicate.hasDuplicate(numbers));
        }
    }
    
}
