package pregunta3;

public class Duplicate {
	Strategy str;
	public void setStrategy(Strategy str) {
		this.str = str;
	}
	
	public boolean hasDuplicate(int[] numbers)
	{
		return str.behaviour(numbers);
	}
}
