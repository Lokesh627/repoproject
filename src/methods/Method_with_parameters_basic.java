package methods;

public class Method_with_parameters_basic {

	public static void main(String[] args) 
	{
		Method_with_parameters_basic method = new Method_with_parameters_basic();  //Object creation//
		method.method1();											   //method calling(Non static regular//			
		
		
		method2();														//method calling(Static regular)//
			

	}
	
	
	
	public void method1()
	{
		int maths=89;
		int science=86;
		int history=79;
		int geography=88;
		int total=maths+science+history+geography;
		int average=total/4;
		System.out.println("My result is "+average);
		
				
	}

	public static void method2() //method without parameter/argument//
	
	{
		//Name, Rollno, Mob, Age, Batch, Gender//
		
		String name="Parag";
		int Rollno=16;
		String mobno= "1234567890";
		float age=24f;
		byte batch=5;
		char Gender='M';
		
		
		System.out.println("My name is "+name);
		System.out.println("My roll no. is "+Rollno);
		System.out.println("My phn no. is "+mobno);
		System.out.println("My age is "+age);
		System.out.println("My batch no. is "+batch);
		System.out.println("My gender is "+Gender);
		
		
		
	}
}
