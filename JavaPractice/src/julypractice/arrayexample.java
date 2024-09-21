package julypractice;

class Demo{
	int salary;
	int age;
	Demo(){
		System.out.println(" i amzero param cons");
	}
	Demo(int x){
		System.out.println("i am int param cons");
		salary = x;
	}
	Demo(int x, int y){
		System.out.println("I am double param cons ");
		salary =x;
		age =y;
	}
	void methodA() {
		System.out.println("salary:"+salary+ "age is:" +age);
	}
	
}


public class arrayexample {

	public static void main(String[] args) {
	/* Demo r1 = new Demo();
	 r1.methodA();
	 Demo r2 = new Demo(34000);
	 r2.methodA();
	 Demo r3 =new Demo(31000,36);
	 r3.methodA();*/
      Demo[] ref = new Demo[3];// non primitive array of demo class, created an object of demo clas using array
      ref[0] = new Demo();
      ref[1]= new Demo(35000);
      ref[2] = new Demo(35000,32);
      ref[0].methodA();
      ref[1].methodA();
      ref[2].methodA();
     
      
	 
	
	 
	 
      	}

}
