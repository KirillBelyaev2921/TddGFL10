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

	@Test
	public void testCalculate() {
		double x = 1;
		assertThat(main.calculate(x))
				.isCloseTo(14.8, Offset.offset(EPS));
	}
}