import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PerfectSquareTest {
	
	@Test
	public void testForEmptyList() {
	testList = Collections.empty();
	int list = list.perfectnumber();
	assertTrue(Collections.PerfectSquares(testList));
	}

	@Test
	public void testForAListWithNumbers() {
	testList = Collections.withnumberd();
	int list = list.perfectnumber();
	assertTrue(Collections.PerfectSquares(testList));
	}

}