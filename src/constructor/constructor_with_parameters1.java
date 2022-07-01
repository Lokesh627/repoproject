package constructor;

public class constructor_with_parameters1 {
	
	int a;
	int b;
	int c;
	
				
		
	public constructor_with_parameters1(int x, int y, int z)
	{
		 a=x;
		 b=y;
		 c=z;
	}
	
	public static void main (String [] args)
	{
		constructor_with_parameters1 object= new constructor_with_parameters1(10, 20, 30);
		object.sum();
		
		constructor_with_parameters1 object1=new constructor_with_parameters1(10,20,50);
		object1.sub();
		
		constructor_with_parameters1 object2=new constructor_with_parameters1(2, 3, 4);
		object2.mul();
		
	}
	
	public void sum()
	{
		int sum=a+b+c;
		System.out.println("The addition is "+sum);
	}	
	
	public void sub()
	{
		int sub=c-b-a;
		System.out.println("The subtraction is "+sub);
	}	
		
	public void mul()
	{	
		int mul=a*b*c;
		System.out.println("The multiplication is "+mul);
	}
	
	
}


