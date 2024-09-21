package ArrayList;

public class PalindromeString {

	public static void main(String[] args) {
		String s1 = "madam";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s2);
		StringBuffer s2_rev = s2.reverse();
		if (s2.equals(s2_rev)) {
			System.out.println("The String is palindrome ");
		} else {
			System.out.println("The String is not palindrome");
		}

	}

}
