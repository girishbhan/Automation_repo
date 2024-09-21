package newpractice;

public class thisstat {
	thisstat(){
		this (25);
		System.out.println("this is zero param cons");
	}
	thisstat(int num){
		this (25,3455.5);
	
		System.out.println("this is int param cons");
	}
	thisstat(int num,double salary){
		this(3200.5,45);
		
		System.out.println("this is int double param cons");
	}
	thisstat(double salary,int num){
		System.out.println("this is double int param cons");
	}

	public static void main(String[] args) {
		System.out.println("prog starts");
	thisstat rev = new thisstat();
	
	

	}

}
