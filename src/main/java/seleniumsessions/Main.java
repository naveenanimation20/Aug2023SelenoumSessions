package seleniumsessions;

strictfp class Calculation {
	strictfp double performCalculation(double x, double y) {
		return x + y;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculation calculator = new Calculation();
		double result = calculator.performCalculation(0.1, 0.2);
		System.out.println("Result: " + result);
	}
}
