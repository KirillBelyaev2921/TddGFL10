import org.assertj.core.data.Offset;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
	private final static double EPS = 1E-9;
	Main main;

	@BeforeMethod
	public void setUp() {
		main = new Main();
	}

	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testFirstCase")
	public void testFirstCase(double x, double expected) {
		assertThat(main.calculate(x))
				.isCloseTo(expected, Offset.offset(EPS));
	}

	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testSecondCase")
	public void testSecondCase(double x, double expected) {
		assertThat(main.calculate(x))
				.isCloseTo(expected, Offset.offset(EPS));
	}

	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testThirdCase")
	public void testThirdCase(double x, double expected) {
		assertThat(main.calculate(x))
				.isCloseTo(expected, Offset.offset(EPS));
	}

	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetCountOfSteps")
	public void testGetCountOfSteps(double step, double start, double end,
									int expected) {
		assertThat(main.getCountOfSteps(step, start, end))
				.isEqualTo(expected);
	}

	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetFunctionValuesByDiapason")
	public void testGetFunctionValuesByDiapason(double step, double start,
												double end, FunctionResult expected) {
		FunctionResult actual = main.getFunctionValuesByDiapason(step, start, end);
		assertThat(actual.x())
				.containsExactly(expected.x(), Offset.offset(EPS));
		assertThat(actual.y())
				.containsExactly(expected.y(), Offset.offset(EPS));
	}
	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetMinY")
	public void testGetMinY(FunctionResult functionResult, int expected) {
		assertThat(main.getMinY(functionResult))
				.isEqualTo(expected);
	}
	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetMaxY")
	public void testGetMaxY(FunctionResult functionResult, int expected) {
		assertThat(main.getMaxY(functionResult))
				.isEqualTo(expected);
	}
	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetSum")
	public void testGetSum(FunctionResult functionResult, double expected) {
		assertThat(main.getSum(functionResult))
				.isCloseTo(expected, Offset.offset(EPS));
	}
	@Test(dataProviderClass = MainDataProvider.class,
			dataProvider = "testGetAvg")
	public void testGetAvg(FunctionResult functionResult, double expected) {
		assertThat(main.getAvg(functionResult))
				.isCloseTo(expected, Offset.offset(EPS));
	}
}