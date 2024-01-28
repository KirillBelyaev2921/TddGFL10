public class Main {
	private static final double A = 2.3;
	public double calculate(double x) {
		double result;

		if (x < 0.2 || x > 2.8) {
			throw new IllegalArgumentException();
		}

		if (x <= 0.3) {
			result = 1.5*A*Math.pow(Math.cos(x), 2);
		} else if (x <= 2.3) {
			result = Math.pow(x - 2, 2) + 6 * A;
		} else {
			result = 3*A*Math.tan(x);
		}
		return result;
	}
}
