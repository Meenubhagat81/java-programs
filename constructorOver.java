/*5. Write a class with multiple 
 * constructors and initialize them ?*/

class student{
	private int rollno;
	private String sName;
	//======default constructor====>>>>>>>>>>>>>
	public student(){                                  
		System.out.println("First constructor running:");
	}
	//=======constructor using one parameter==>>>>
	public student(int rollno){
		System.out.println("Second constructor running:");
		this.rollno = rollno;
		
	}
	//========constructor using multiple parameter=====>>>>
	public student(int rollno,String sName){
		System.out.println("Third constructor is running:");
		this.rollno = rollno;
		this.sName = sName;
		
	}
	public void displaydata(){
		System.out.println(rollno+" "+sName);
	}
}
public class constructorOver {
public static void main(String[] args) {
	student s1 = new student();
	student s2 = new student(5);
	student s3 = new student(10, "Khushdeep");
	student s4 = new student(11,"Gudia");
	s1.displaydata();
	s3.displaydata();
	s2.displaydata();
	s4.displaydata();
}
}
