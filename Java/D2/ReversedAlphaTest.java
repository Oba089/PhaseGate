import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedAlpha {

	@Test
	public void testforNoAlphabets() {

	Reverse reverse = new Reverse();

	int reults = reverse.totalNumberOfLetters();;

	assertEquals(result, 0);

}

	@Test
	public void testforAvailableAlphabets() {

	Reverse reverse = new Reverse();

	String results = reverse.totalNumberOfLetters("abcdefd");
	
	assertEquals(result, "Alphabet added successfully");
}

	@Test
	public void testforAvailableAlphabets() {

	Reverse reverse = new Reverse();

	String results = reverse.totalNumberOfLetters("abcdefd");
	
	assertEquals(result, "d");
}
	
	@Test
	public void testforReversedAlphabets() {
	
	Reverse reverse = new Reverse();

	String result = reverse.totalNumberOfLetters("dcbaefd");

	assertEquals(result, "Reversed")
}
}