package methods;

public class Method_Study_2_Objects_Non_static {

	public static void main(String[] args) {
		
		RegularStaticMethod(); //Calling static regular method from same class//
		
		Method_study_3_objects_Non_static.Staticmethod(); //Calling static regular method from another class//
		
		//To call non static regular method from same class--> we need objects//
		//classname objectname= new classname();
		Method_Study_2_Objects_Non_static object1 = new Method_Study_2_Objects_Non_static(); //Creating object//
		
		//To call non static regular method from same class--> objectname.methodname
		object1.RegularNonStaticMethod(); //Calling non static regular method from same class//
		
		
		//To call non static regular method from another class, we need another object//
		Method_study_3_objects_Non_static object2 = new Method_study_3_objects_Non_static(); //Object created//
		
		object2.Nonstaticmethod(); //Calling non static regular method from another class// 
		
		

	}

	public static void RegularStaticMethod() //Regular Static Method//
	{
		int a=100;
		int b=200;
		int sum;
		sum=a+b;
		System.out.println("Addition of a and b is "+sum);
		
	}
	
	public void RegularNonStaticMethod()     //Regular Non-Static Method//
	{
		int a=100;
		int b=50;
		int sub=a-b;
		System.out.println("Subtraction of a and b is"+sub);
	}
}
