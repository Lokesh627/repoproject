package constructor;

public class constructor_with_parameters {
	
	//Constructor with parameters//
	int a; //Variable Declaration//
	int b; //Variable Declaration//
	int c; //Variable Declaration//
	
	public constructor_with_parameters() //Constructor without parameters//
	{
		a=10;
		b=20;
		c=30;
		
	}
	
	public constructor_with_parameters(int x) //Constructor with parameter//
	{
		a=x; //int default value is---> 0
	}
	
	public constructor_with_parameters(int x, int y) //Constructor with parameters//
	{
		a=x; 
		b=y;
	}
	
	public constructor_with_parameters(int x, int y, int z) //Constructor with parameters//
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args)
	{
		constructor_with_parameters object=new constructor_with_parameters(); //Object Creation//
		//Calling constructor without parameter//
		object.sum();
		
		constructor_with_parameters object1=new constructor_with_parameters(100); //Object creation//
		//Calling constructor with one parameter//
		object1.sum();
		
		constructor_with_parameters object2=new constructor_with_parameters(100, 200);
		//Calling constructor with two parameters//
		object2.sum();
		
		constructor_with_parameters object3=new constructor_with_parameters(100, 200, 300);
		//Calling constructor with three parameters//
		object3.sum();
	}
	
	public void sum()
	{
		int sum=a+b+c;
		System.out.println("Sum is "+sum);
		
	}
}
