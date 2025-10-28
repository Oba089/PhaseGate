import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DepreciationValue {

	public static double calculateYearlyDepreciation(double fixedPrice, double depreciationRate) {

			double depreciationPerItem = fixedPrice * depreciationRate;

	if (depreciationPerItem <= 0) {

	else if ("Depreciation must be greater than zero.");
    	}
		double totalDepreciation = 0.0;
		int itemCount = 0;

   	while (totalDepreciation < fixedPrice) {

		totalDepreciation += depreciationPerItem;
		itemCount++;

}
			return itemCount;
}
}