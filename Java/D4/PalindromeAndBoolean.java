public class PalindromeAndBoolean {

	public static void main(String[] args) {

	String[] words = {"tenet", "abba", "Deji", "Hannah",};

	palindromeword(words);
	}

public static void palindromeword(String[] words) {
	
	for (String word : words) {

	String returnedWord = new String(word).reverse();

	boolean isPalindrome = word.equals(returnedWord);

	
	if (isPalindrome) {
	System.out.println(" " + word + "is Palindrome");

	} else {

	System.out.println(" " + word + "is not Palindrome");
	}
}
}
}
