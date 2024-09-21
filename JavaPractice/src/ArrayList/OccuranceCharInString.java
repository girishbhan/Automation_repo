package ArrayList;

public class OccuranceCharInString {

	public static void main(String[] args) {
		String s = "java Programming Language";
		int total_count = s.length();
		System.out.println(total_count);
		
		int new_count = s.replace("a", "").length();
		System.out.println("Occurance of a " + (total_count - new_count));
		OccuranceCharInString.reverseString("aau lalita and aau babita");
	}
	public static void reverseString(String s1) {
		String rev ="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev = rev+s1.charAt(i);
			
		}
		System.out.println(rev);
	}

	}

