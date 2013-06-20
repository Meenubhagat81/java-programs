/*Program showing concept of inheritance
 * class animal is parent class 
 * and extend it to different 
 * kind of animals herbivorous, carnivorous etc*/

class lion{
	public String name;
	public int age;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	
	
}
public class animalCl {
public static void main(String[] args) {
	lion l1 = new lion();
	l1.setAge(2);
	System.out.println("This is parent class getting lion age : "+l1.getAge());
	l1.setName("Baby Lion");
	System.out.println("Class getting lion name : "+l1.getName());
	///////////////////=====child class obj ====>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	herbivoures herb1 = new herbivoures();
	herb1.herb();
	herb1.frog();
	
	carnivouroues c1 = new carnivouroues();
	System.out.println("\n\n carnivouroues class is child class of animal: "+c1.childclassName);
	c1.features();
	c1.fox();
	
}

}
