/* a class employee with 4-5 attributes 
 * and setter getter for them perform operation 
 * initialize them with data and write a method to display them */

class employee {
	private int age;
	private String name;
	private double salary;
	private int id;

	//------ setter and getter for performing operation------->>>>>>
	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final String getName() {

		return name.toUpperCase();
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getSalary() {
		return salary;
	}

	public final void setSalary(double salary) {
		this.salary = salary;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

}

public class createClass {
	public static void main(String[] args) {
		employee employee1 = new employee();
		employee employee2 = new employee();
		employee employee3 = new employee();

		//----------data display with object---------->>>>>>>>>>>>>>
		employee1.setAge(25);
		employee1.setName("gita");
		employee1.setId(201);
		employee1.setSalary(200000);
		System.out.println("\n\tFirst Employee detail");

		System.out.println("Employee id    :" + employee1.getId());
		System.out.println("Employee name  : " + employee1.getName());
		System.out.println("Employee Age   :" + employee1.getAge());
		System.out.println("Employee salary:" + employee1.getSalary());

		employee2.setAge(50);
		employee2.setName("rahul");
		employee2.setId(202);
		employee2.setSalary(300000);
		System.out.println("\n\tSecond Employee detail");

		System.out.println("Employee id    :" + employee2.getId());
		System.out.println("Employee Name  :" + employee2.getName());
		System.out.println("Employee Age   :" + employee2.getAge());
		System.out.println("Employee salary:" + employee2.getSalary());

		employee3.setAge(20);
		employee3.setName("jyoti");
		employee3.setId(203);
		employee3.setSalary(250000);
		System.out.println("\n\tThird Employee detail");

		System.out.println("Employee id:" + employee3.getId());
		System.out.println("Employee Name:" + employee3.getName());
		System.out.println("Employee Age:" + employee3.getAge());
		System.out.println("Employee Salary:" + employee3.getSalary());

	}

}
