package week3.day1;

//AxisBank class inherits BankInfo class
public class AxisBank extends BankInfo {
	
	//Method overrided
	public void deposit(String string1)
	{
		System.out.println(string1);
	}

	public static void main(String[] args) {
		AxisBank objAxisBank=new AxisBank();
		objAxisBank.deposit("No Deposit 'ewwww'");
		objAxisBank.saving();
	}

}
