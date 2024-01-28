public class Main {
	private static final double A = 2.3;
	public double calculate(double x) {
		double result = 0;

		if (x < 0.2 || x > 2.8) {
			throw new IllegalArgumentException();
		}

		if (x <= 0.3) {
			result = 1.5*2.3*Math.pow(Math.cos(x), 2);
		} else if (x <= 2.3) {
			result = Math.pow(x - 2, 2) + 6 * A;
		} else {

		}
		return result;
	}
}
