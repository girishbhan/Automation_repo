package ArrayList;

public class WhiteSpacesFromString {

	public static void main(String[] args) {
		//logic is invented by me
		String s = "Gandit Khuta";
	


String str= "nduf  jbfrb burigr ";
		String ref ="";
		for (int i =0;i<str.length();i++) {
			char ch;
			ch = str.charAt(i);
			if (ch ==' ') {
	        ref = ref;
	        
			}else {
				ref =ref+str.charAt(i);
			}
		}
 System.out.println(ref);
	}
  static void removewhitespace(String s) {
	  //using Character class
	  String result ="";
	  for(int i = 0;i<s.length();i++) {
		  char ch = s.charAt(i);
		  if(!Character.isWhitespace(i)) {
			  result = result+ch;
		  }
	  }
	  System.out.println(result);
  }
	
}
