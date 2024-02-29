package TASK2;
//Question : 4
class Person_New // Parent Class
 {
	String name;
	int Age;
	Person_New(String name,int age)// Parent Class Constructor
	{
		this.name = name;
		this.Age = age;
	}
	
	
 }

class Employee extends Person_New// Child Class, with the extends keyword we are able to inherits the data member of parent class
	{
	int Employee_id;// instance variable
	int Employee_Salary;// instance variable
	public Employee(String name, int age, int employee_id, int employee_Salary) 
	{
		super(name, age);// Super Keyword is the Method which will executes the Constructor of the parent class
		Employee_id = employee_id;
		Employee_Salary = employee_Salary;
	}
	void Display()
	{
		System.out.println("Details of Employee :\n"+"Name:"+name+"\n"+"Age:"+Age+"\n"+"Employee_id:"+Employee_id+"\n"+"Employee_Salary:"+Employee_Salary);
	}
	
	}
	
	
public class Controller // This is the controller Class
{
 		public static void main(String[] args) {
		Employee emp1 = new Employee("Saravana",30,18101015,30000);
		emp1.Display();
		
	}
}

/* OUTPUT */
//Details of Employee :
//Name:Saravana
//Age:30
//Employee_id:18101015
//Employee_Salary:30000
