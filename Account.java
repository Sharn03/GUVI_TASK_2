package TASK2;
//Question 1.3
public class Account{
	String name;// instance varible
	int Acc_number;// instance variable
	static int Minimum_Balance = 5000;//static variable
	Account()// non-paramaterized constructor
	{
		System.out.println("Non_paramaterized Constructor");
	}
	Account(String name,int Acc_Number)// Constructor with 2 Arguments
	{
		this.name = name;
		this.Acc_number = Acc_Number;
	}
	void Deposit(int Deposit_Amount)//Instance Method of Deposit
	{ 
		
		Minimum_Balance += Deposit_Amount;
	}
	void WithDraw(int WithDraw_Amount)//Instance method of Withdraw
	{
		
		Minimum_Balance += WithDraw_Amount;
	}
	void Display_Balance(String name)//Instance Method for Display
	{
		System.out.printf("Available_Balance of %s",name +" : "+ Minimum_Balance+'\n');
	}
	public static void main(String[] args) {
		Account Person1 = new Account("Suresh",1111);//Object Creation
		
		Account Person2 =  new Account("Sudha",3333);
		
		Person2.WithDraw(1000); // Performing Withdraw Method on the object
		
		Person2.Display_Balance(Person2.name);
		
		Person1.Deposit(1000); //Performing Deposit Method on the object
		
		Person1.Display_Balance(Person1.name);
		
	}
}
/*
 * OUTPUT OF THE QUESTION Available_Balance of Sudha : 6000
 *  Available_Balance of Suresh : 7000
 *
 */