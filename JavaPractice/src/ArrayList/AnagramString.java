package ArrayList;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(AnagramString.checkAnagram("historY", "ishTory"));

	}

	public static boolean checkAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");// to remove all the spaces from the String
		String str2 = s2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			return Arrays.equals(arr1, arr2);
		}

	}

}
