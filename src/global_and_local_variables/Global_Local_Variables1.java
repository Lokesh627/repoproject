package global_and_local_variables;

public class Global_Local_Variables1 {

	int p=20; 		//Global non-static variables//
	int q=30;		//Global non-static variables//
	static int r=40;//Global static variables//
	
	
	
	
	public static void main(String[] args) 
	{
		Global_Local_Variables1 Object=new Global_Local_Variables1();
		Object.Test();
		Test1();
		System.out.println("Value of p is "+Object.p);
		System.out.println(Object.q);
		System.out.println("Value of r is "+r);
		
		int addition=100+Object.p;
		System.out.println("Value of addition is "+addition);
		
		Global_Local_Variables2.display1();
		Global_Local_Variables2 Object1=new Global_Local_Variables2 ();
		Object1.display();
		System.out.println("Value of m is "+Object1.m);
		System.out.println("Value of n is "+Global_Local_Variables2.n);
		
		int sub=150-Object1.m;
		int mul=10*Global_Local_Variables2.n;
		int sub1=Global_Local_Variables2.n-Object1.m;
		System.out.println("Value of sub is "+sub);
		System.out.println("Value of mul is "+mul);
		System.out.println("Value of sub1 is "+sub1);
	}
	
	public void Test()
	{
		int mul=p*q;
		System.out.println("Multiplication is "+mul);
	}

	public static void Test1()
	{
		int sum=10+r;
		System.out.println("Sum is  "+sum);
	}
}
