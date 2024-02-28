package TASK2;
//Question 1.2

import java.util.Scanner;
//Parent Class
class product{ 
	int Product_id;
	int Price;
	int Quantity;
	

	product (int x,int y ,int z) // Constructor of Class product
	{
	this.Product_id = x;
	this.Price = y;
	this.Quantity = z;
	}
//Method for Finding the Product ID of the product with max. Price
	static int Highest_Price_ID(product[]obj)
	{
		int Max_Price_id = 0;
		for(int i = 0;i<obj.length;i++)
		{
			if(obj[i].Price>Max_Price_id)
			{
				Max_Price_id = i;
			}
		}
		return obj[Max_Price_id].Product_id;
		
	}
}
//Driver Class or Controller Class
public class Main {
public static void main(String[] args) {
	// Getting the user input based on which number of Objects are created -> 3
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no. of Product");
	int n = s.nextInt();
	product obj[] = new product[n]; //n = 3
	for(int i= 0 ;i<n;i++)
	{
		// We are Creating "Array of Objects" 
		// Each object has 3 data member(Product_id,Price,Quantity)
		// In-order to Assign the value for the instance variable, we use parameterized constructor  
		// Where the Arguments are passed as User Input
		obj[i] = new product(s.nextInt(),s.nextInt(),s.nextInt());
		
	}
	int Highest_Product_id = product.Highest_Price_ID(obj);
	System.out.println("Product ID of the product of highest Price" + " "+Highest_Product_id);
	Total_Amount(obj);// Passing the Object Array as the Argument to the function Total_Amount
	s.close();
	
	
	
		}
static void Total_Amount(product[]obj2)// Getting the Object Array as Arguments
{
	int total_amount_spent = 0;
	
	for(int i = 0;i<obj2.length;i++)
	{
	total_amount_spent = total_amount_spent + (obj2[i].Price * obj2[i].Quantity);
	}
	System.out.println("Total Amount spent on all the Product :" +" "+total_amount_spent+"Rs");
}

}
/*
 * Input for object 1 -> product-id = 0111,Price = 10 rs; Quantity = 5Kg 
 * Input for object 2-> product-id =  0222,Price = 50 rs; Quantity = 10Kg 
 * Input for object 3 -> product-id = 0333,Price = 100 rs; Quantity = 20Kg
 * 
 * 
 */
/*
 * Output:
 * Product Id of the product with the highest_price : 0333 
 * Total amount Spent on all the product = 2550 Rs
 */