import org.testng.annotations.DataProvider;

public class MainDataProvider {

	@DataProvider
	public static Object[][] testFirstCase() {
		return new Object[][]{
				{0.2, 3.3138302146549767},
				{0.3, 3.148703935719195},
		};
	}
	@DataProvider
	public static Object[][] testSecondCase() {
		return new Object[][]{
				{0.302, 16.683204},
				{1, 14.8},
				{2, 13.8},
				{2.3, 13.89},
		};
	}
	@DataProvider
	public static Object[][] testThirdCase() {
		return new Object[][]{
				{2.302, -7.6915570953548595},
				{2.4, -6.320498598746533},
				{2.8, -2.4531558383931147},
		};
	}
	@DataProvider
	public static Object[][] testGetCountOfSteps() {
		return new Object[][]{
				{0.002, 0.3, 2.8, 1251},
				{1, 0.3, 2.8, 3},
				{0.2, 0.3, 2.8, 13},
				{0.001, 0, 1, 1001},
		};
	}
	@DataProvider
	public static Object[][] testGetFunctionValuesByDiapason() {
		return new Object[][]{
				{2, 0.3, 2.8,
						new FunctionResult(new double[]{0.3, 2.3},
								new double[]{3.148703935719195, 13.89})},
				{1, 0.3, 2.8,
						new FunctionResult(new double[]{0.3, 1.3, 2.3},
								new double[]{3.148703935719195, 14.29, 13.89})},
				{1, 1, 2,
						new FunctionResult(new double[]{1, 2},
								new double[]{14.8, 13.8})},
		};
	}
}
