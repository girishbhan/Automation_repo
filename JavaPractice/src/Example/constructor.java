package Example;

public class constructor {
	int a=25;
	constructor (int num){
		System.out.println("i am a constructor");
		a = num;
	  
	
	}

	public static void main(String[] args) {
		System.out.println("i am a main method");
		constructor ref = new constructor(50);
		constructor ref1 = new constructor(80);
		//int d;
		 int d =ref.a + 30;
		 int g =ref1.a +30;
		System.out.println(d);
		System.out.println(g);
		

	}

}
