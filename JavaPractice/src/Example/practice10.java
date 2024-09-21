package Example;

public class practice10 {
 int age;
 int salary;
 practice10(){
	 System.out.println(" i am zero param cons");
 }
 practice10(int num){
	 System.out.println(" i am param cons");
	 age = num;
 }
 practice10(int num1, int num){
	 System.out.println("i am double param cons");
	 age =num1;
	 salary =num;
	 }
	 
 public static void main(String[] args) {
	 System.out.println("program starts");
	 practice10 var = new practice10();
	 System.out.println(var.age);
	 System.out.println(var.salary);
	 practice10 var1 = new practice10(50);
	 System.out.println(var1.age);
	 System.out.println(var1.salary);
	 practice10 var2 = new practice10(50,15000);
	 System.out.println(var2.age);
	 System.out.println(var2.salary);
	 
	 
	 
	 
 }


	}

 
