package week3.day1;

//Concrete class inherits abstract class
public class Automation extends MultipleLanguage {

	public static void main (String[] args)
	{
		Automation objAutomation=new Automation();
		objAutomation.python();
		objAutomation.ruby();
		objAutomation.selenium();
		objAutomation.Java();
}
    //Implemetned all methodss
   public void selenium() {
		
		System.out.println("Learning selenium");
		
	}

	public void Java() {
		System.out.println("Learning Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Learning Java");
		
	}
	}