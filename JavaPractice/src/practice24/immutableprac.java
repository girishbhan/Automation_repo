package practice24;

final class Krishna{
	final  int salary;
	final String name;
	 Krishna(int salary,String name) {
		 this.salary =salary;
		 this.name=name;
		
	}
	public  int getSalary() {
		 return salary;
	 }
	public  String getName() {
		 return name;
	 }
	
}

public class immutableprac {
	

	public static void main(String[] args) {
     Krishna ref = new Krishna(43000,"Girish");
     System.out.println(ref.salary);
     System.out.println(ref.name);
        //  ref.salary = 56000; //bcoz of the immutable class we cant change the value of the object
     System.out.println(ref.getSalary());
     System.out.println(ref.getName());
    int a  = ref.getSalary();
    a =76000;
    System.out.println(ref.getSalary());
     }
	}


