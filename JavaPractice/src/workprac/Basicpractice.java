package workprac;

public class Basicpractice {
	int age =45000;
	static double salary =45.2;//we can reinitialize the value of SG variables from any method and after that in every method the value will be that updated value
	

	public static void main(String[] args) {
		Basicpractice ref = new Basicpractice();
	  System.out.println(ref.age);
	  ref.methodB();
       Basicpractice.salary=34;
	  ref.age = 35000;
	  System.out.println(ref.age);
	  ref.methodB();
	  System.out.println(salary);
	  
	  int a =0,b;
	  b = ++a + a++ +a + ++a;
	  System.out.println(b);
	  ref.evenNumber(5);
	   System.out.println(ref.evenNumber(5));
	  
	 }
static void methodA() {
	 Basicpractice ref = new Basicpractice();//for accesing ns members in every method we need to create different object.
	 System.out.println(ref.age);
}
void methodB() {
	System.out.println("method ns");
	System.out.println(age);
	System.out.println(salary);
	Basicpractice.salary =55;
	}
  int evenNumber(int num) {
	  if(num%2==0) {
		  System.out.println("the number is even");
	  }
	  else {
		  System.out.println("the number is odd");
	  }
	  return num;
  }

}
