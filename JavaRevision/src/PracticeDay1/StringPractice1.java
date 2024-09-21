
package PracticeDay1;

public class StringPractice1 {
	public static void main(String[] args) {
  String s = new String("I am learning automation");
  System.out.println(s.length());
  System.out.println(s.toLowerCase());
  System.out.println(s.toUpperCase());
  System.out.println(s.charAt(0));
System.out.println(s.concat("Testing"));  
System.out.println(s.trim());
for (int i=0;i<s.length();i++) {
	System.out.println(s.charAt(i));
}
for (int i = s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));//mirror image
}
System.out.println( StringPractice1.methodA());
}
static StringBuffer methodA() {
	String Sr = "welcometoautomation";
	char ch = 'h';
	int index = 6;
	StringBuffer Str = new StringBuffer(Sr);
	Str.insert(index, ch);
	System.out.println(Str);
	return Str;
	

}

}
