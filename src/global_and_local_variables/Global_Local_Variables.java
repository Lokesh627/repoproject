package global_and_local_variables;

public class Global_Local_Variables {
	int a=10;		 //Non-Static global variable//
	int b=20;		 //Non-Static global variable//
	static int c=30; //Static global variable//
	static int d=40; //Static global variable//
	
	

	public static void main(String[] args) 
	{
		Global_Local_Variables Object=new Global_Local_Variables();
		Object.addition();
		Global_Local_Variables.Subtraction();
	}
	
	
	public void addition()
	{
		int sum1=a+b;//Non-Static variables (global)//
		int sum2=c+d;//Static Variables(global)//
		int m=50;	 //Local variables//
		System.out.println("Sum is "+sum1);
		System.out.println("Sum is "+sum2);
		System.out.println("Value of m is "+m);
	}
	
	public static void Subtraction()
	{
		//We can call only static variables in static method//
		//int sub1=b-a; We cannot call this//
		int sub2=d-c;
		System.out.println("Subtraction is "+sub2);
		
	}
}
