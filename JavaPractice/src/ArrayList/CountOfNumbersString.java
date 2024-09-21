package ArrayList;

public class CountOfNumbersString {

	public static void main(String[] args) {
		numberCount("bfugfug354546");

	}

	public static void numberCount(String s) {
		int Digit_count = 0;
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (Character.isDigit(ch)) {
				Digit_count++;
			}

		}
		System.out.println(Digit_count);
	}
	public static void stringImmutable() {
		String s1 = "Doska Dadang";
		String s2 = "Doska Dadang";
		
	}
}
