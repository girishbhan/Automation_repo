
public class dailypractice {
double salary= 45000;
static int age;

	public static void main(String[] args) {
	System.out.println("program starts");
	dailypractice.age = 36;
	System.out.println(dailypractice.age);
	dailypractice ref = new dailypractice();
	double sum = ref.salary +dailypractice.age;
	System.out.println("double salary"+sum);
	methodA(25000);
	System.out.println(methodA(25000));
	System.out.println(ref.methodB(50000));
	double every= methodA(25000)+ref.methodB(50000);
	System.out.println(every);
	
	}
	static double methodA(double all) {
		System.out.println(" i am static method A");
		dailypractice rev = new dailypractice();
		all = dailypractice.age+rev.salary;
		System.out.println("value of all"+all);
		return all;
		}
    double methodB(double fullsalary) {
    	System.out.println("i am nsmmethodB");
         int total = 30000;
         fullsalary = this.salary+total;
         return fullsalary;
          }
 
    
}
