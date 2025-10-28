import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestingDepreciationValue {

	@Test
	public static void testCalculatedItemsForFree() {
    
	DepreciationCalculator calculator = new DepreciationCalculator();
		int expectedItems = 13;

		int actualItems = calculator.calculateItemsForFree();
        
		assertEquals(expectedItems, actualItems, "The calculated number of items should be 13.");
    }
 
}