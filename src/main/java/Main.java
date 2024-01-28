import java.util.Arrays;

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

	public int getCountOfSteps(double step, double start, double end) {
		return ((int) ((end - start) / step)) + 1;
	}

	public FunctionResult getFunctionValuesByDiapason(double step, double start, double end) {
		int n = getCountOfSteps(step, start, end);
		double[] x = new double[n];
		double[] y = new double[n];

		double current = start;
		for (int i = 0; i < n; i++) {
			x[i] = current;
			y[i] = calculate(current);
			current += step;
		}
		return new FunctionResult(x, y);
	}

	public double getMaxY(FunctionResult functionResult) {
		return Arrays.stream(functionResult.y())
				.max().orElse(0);
	}
	public double getMinY(FunctionResult functionResult) {
		return Arrays.stream(functionResult.y())
				.min().orElse(0);
	}
	public double getSum(FunctionResult functionResult) {
		return Arrays.stream(functionResult.y())
				.sum();
	}
	public double getAvg(FunctionResult functionResult) {
		return Arrays.stream(functionResult.y())
				.average().orElse(0);
	}
}
