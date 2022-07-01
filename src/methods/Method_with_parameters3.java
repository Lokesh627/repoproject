package methods;

public class Method_with_parameters3 {

	public static void main(String[] args) {
		
		Method_with_parameters3 object= new Method_with_parameters3(); //Object Creation//
		
		object.mathsoperation();
		
		object.mathsoperation1(10, 20, 30, 40);
		object.mathsoperation1(100, 200, 300, 400);
		

	}
	
	public void mathsoperation() //Without Parameters//
	{
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int sum=a+b+c+d;
		int sub=d-c-b-a;
		long mul=(a*b*c*d);
		int div=(d+c+b)/a;
		
		System.out.println("Addition is "+sum);
		System.out.println("Subtraction is "+sub);
		System.out.println("Multiplication is "+mul);
		System.out.println("Division is "+div);
	}
	
	public void mathsoperation1(int a, int b, int c, int d) //WithParameters//
	{
		int sum=a+b+c+d;
		int sub=d-c-b-a;
		long mul=a*b*c*d;
		int div=(d+c+b)/a;
		System.out.println("Addition is "+sum);
		System.out.println("Subtraction is "+sub);
		System.out.println("Multiplication is "+mul);
		System.out.println("Division is "+div);
	}
}
