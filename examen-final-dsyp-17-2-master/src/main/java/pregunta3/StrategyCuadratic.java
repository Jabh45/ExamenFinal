package pregunta3;

public class StrategyCuadratic implements Strategy{

	@Override
	public boolean behaviour(int[] numbers) {
		long steps = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                steps++;
                if (i != j && numbers[i] == numbers[j]) {
                    System.out.println(steps + " steps");
                    return true;
                }
            }
        }
        System.out.println(steps + " steps");
        return false;
	}

}
