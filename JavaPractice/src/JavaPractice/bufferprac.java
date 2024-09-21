package JavaPractice;

public class bufferprac {

	public static void main(String[] args) {
   StringBuffer bf = new StringBuffer("I am learning automation ");
  System.out.println("length of String"+bf.length());
  bf.append("Java");
  System.out.println(bf);
  System.out.println(bf.charAt(5));
  System.out.println(bf.indexOf("l"));
  System.out.println(bf.lastIndexOf("t"));
  System.out.println(bf.capacity());
   System.out.println(bf.reverse());
  
	}

}
