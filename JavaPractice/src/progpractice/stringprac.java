package progpractice;

public class stringprac {

	public static void main(String[] args) {
  //  String s = new String ("java");
    String ab = new String("automation");
    String a = "";
     System.out.println("no.of characters in string:"+ab.length());
     System.out.println(ab.charAt(1));
     for(int i =1; i<ab.length();i++) {
    	 a = a+ab.charAt(i);
     }
     System.out.println(a);
	}

}
