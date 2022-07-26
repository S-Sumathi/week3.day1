package week3.day1;

public class Students {
	
	//Methods of Students class getStudentInfo method is being overloaded
	public void getStudentInfo(String StudentId)
	{
		System.out.println("StudentId: " + StudentId);
		
	}
	public void getStudentInfo(String StudentId,String StudentName)
	{
		System.out.println("StudentId and Name: " + StudentId + " " +StudentName);
		
	}
	public void getStudentInfo(String email,long Phonenumber)
	{
		System.out.println("Email and Phone Number: " + email + " " +Phonenumber);
		
	}

	public static void main(String[] args) {
		
		Students objStudents=new Students();
		objStudents.getStudentInfo("082604523");
		objStudents.getStudentInfo("082604523", "Sumathi");
		objStudents.getStudentInfo("gsmathi88@gmail.com", 9629702304L);

	}

}
