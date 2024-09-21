package newpractice;

public class thiskey {
	int age = 25;
	int salary = 30000;

	public static void main(String[] args) {
		thiskey ref = new thiskey();
		ref.methodV(45);
		

	}
    void methodA() {
    	
    	System.out.println("i am ns method and value of age is :"+this.age);
    	
    }
    void methodV(int age) {
    	age =36;
    	System.out.println("value of local age is :"+age);
    	System.out.println("value of global age is:"+this.age);
    	this.age=age;
    	System.out.println(this.age);
    	methodA();
    }  
}
