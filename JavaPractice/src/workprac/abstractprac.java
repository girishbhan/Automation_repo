package workprac;
/*3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods
to handle deposits and withdrawals for each account type.*/
abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
	
}
class SavingAccount extends BankAccount {
	void deposit() {
		int dep,sav,rup;
		sav =4566;
		rup = 560;
		dep = sav+rup;
		System.out.println("deposit amount is :"+dep);
		
	}
	void withdraw() {
		System.out.println("withraw method");
	}
}
public class abstractprac {

	public static void main(String[] args) {
		SavingAccount b1= new SavingAccount();
		b1.deposit();
		b1.withdraw();

	}

}
