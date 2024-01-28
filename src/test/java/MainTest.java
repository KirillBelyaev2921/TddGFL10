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
	dataProvider = "testSecondCase")
	public void testSecondCase(double x, double expected) {
		assertThat(main.calculate(x))
				.isCloseTo(expected, Offset.offset(EPS));
	}
}