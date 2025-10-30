import java.util.List;

public class PerfectSquare {

	public static boolean arePerfectSquares(List<Integer> numbers) {

	if (numbers == null) {
		return false;
		}

	if (arePerfectSquares(numbers)) {

		return true;
	} else {

		return false;
		}
	}
}
