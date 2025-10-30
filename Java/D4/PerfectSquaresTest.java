import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PerfectSquareTest {
	
	@Test
	public void testForEmptyLst() {

	test List = Collections>empty();

	int result = library.totalNumberOfBooks();

	assertEquals(result, 0);
	}


    @Test
    void testAllPerfectSquares() {
        List<Integer> testList = Arrays.asList(4, 9, 25, 49);
        assertTrue(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testMixedList() {
        List<Integer> testList = Arrays.asList(4, 9, 10, 49);
        assertFalse(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testEmptyList() {
        List<Integer> testList = Collections.emptyList();
        assertTrue(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testListWithZero() {
        List<Integer> testList = Arrays.asList(0, 1, 4);
        assertTrue(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testListWithNegativeNumber() {
        List<Integer> testList = Arrays.asList(4, -9, 25);
        assertFalse(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testSinglePerfectSquare() {
        List<Integer> testList = Collections.singletonList(16);
        assertTrue(PerfectSquareChecker.areAllPerfectSquares(testList));
    }

    @Test
    void testSingleNonPerfectSquare() {
        List<Integer> testList = Collections.singletonList(15);
        assertFalse(PerfectSquareChecker.areAllPerfectSquares(testList));
    }
}