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
				{0.3002, 16.68932004},
				{1, 14.8},
				{2, 13.8},
				{2.3, 13.89},
		};
	}
	@DataProvider
	public static Object[][] testThirdCase() {
		return new Object[][]{
		};
	}
}
