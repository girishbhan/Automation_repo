package StringRepractice;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		String s = "Learning Automation";
		StringBuffer str = new StringBuffer(s);
		System.out.println("reverse of the String : " + str.reverse());
		System.out.println(whiteSpaces("bhagu baicha dalla "));
		System.out.println(anagramCheck("madam", "adamm"));
		palindrome("madam");// If the static mehod has return type void then you cant keep it in println
							// statement
		caseName("bhokshyat BhjJE");
		System.out.println(s2iConversion("245"));
	}

	public static String whiteSpaces(String s1) {
		// using replaceAll();
		String rev = s1.replaceAll("\\s", "");
		return rev;
	}

	public static boolean anagramCheck(String s1, String s2) {
		char[] arr1 = s1.replaceAll("\\s", "").toCharArray();
		char[] arr2 = s2.replaceAll("\\s", "").toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);

	}

	public static void palindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("The String is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}

	}

	public static void caseName(String s) {
		char ch;
		int up_char = 0;
		int lo_char = 0;
		int s_char = 0;
		int digit = 0;
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			ch = arr[i];
			if (Character.isUpperCase(ch)) {
				up_char++;
			} else if (Character.isLowerCase(ch)) {
				lo_char++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				s_char++;
			}
		}
		System.out.println(up_char + "\t" + lo_char + "\t" + digit + "\t" + s_char);

	}

	public static int s2iConversion(String s) {
		int i = Integer.parseInt(s);
		return i;
	}

}