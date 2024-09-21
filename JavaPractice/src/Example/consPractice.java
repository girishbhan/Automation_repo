package Example;

public class consPractice {
  int a= 20;
  
	consPractice() {
		System.out.println("i am a constructor");
		 a = 25;// this is wrong coz we have already deaclred a is variable, so in cons only need to initialize it..
	}

	public static void main(String[] args) {
		System.out.println("program starts");
		System.out.println("program ends");
		consPractice temp = new consPractice();
		System.out.println(temp.a);

	}

	
}
