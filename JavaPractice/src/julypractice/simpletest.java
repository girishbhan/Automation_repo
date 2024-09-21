package julypractice;

class Zavri{
	int dec;
	int deng;
	void methodA() {
		System.out.println("deng khavrya");}
	public String toString() {
		return "hello";
	
		
	}
	public int hashCode() {
		return 199;
	}
	public boolean equals(Object obj) {
	 return false;
		
	}
}

public class simpletest {

	public static void main(String[] args) {
     Zavri ref = new Zavri();
     ref.toString();
     System.out.println("string representation of object is :"+ref.toString());
     Zavri ref1 = new Zavri();
     System.out.println("string representation of obj. ref1 is :"+ref1.toString());
     // hashcode() prints the hexadecimal code into integer value .integer value of hexadecimal code is :
     System.out.println("integer value of hexadecimal code is :"+ref.hashCode());
     System.out.println("integer value of ref1 address is:"+ref1.hashCode());
     Zavri ref2 = ref;// created new object and given it's value 
     System.out.println("comparing values of two objects based on address:"+ref.equals(ref2));
     System.out.println("string representation of object ref2 :"+ref2.toString());
     System.out.println("integer value of hexadecimal code of ref2 value is:"+ref2.hashCode());
     System.out.println("comparing ref2 with ref:"+ref1.equals(ref));// 
      // Overriding the methods
     
     
     
     
     
	}

}
