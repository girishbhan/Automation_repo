package ArrayList;

public class AllCharPercent {

	public static void main(String[] args) {
		String s = "dadang denGNa*&&%%";
		char[] arr = s.toCharArray();
		int lowerCase_count = 0;
		int upperCase_count = 0;
		int sChar_count = 0;
		int numberCount = 0;
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (Character.isLowerCase(ch)) {
				lowerCase_count++;
			} else if (Character.isUpperCase(ch)) {

				upperCase_count++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			} else {
				sChar_count++;
			}
		}
		System.out.println("UpperCase letters:"+upperCase_count+" LowerCase Letters :"+lowerCase_count+ "  Special chars: "+sChar_count+ "  Digits Count: "+numberCount);

	}

}
