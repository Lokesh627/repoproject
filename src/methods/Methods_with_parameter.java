package methods;

public class Methods_with_parameter {

	public static void main(String[] args)
	{
		Methods_with_parameter m= new Methods_with_parameter();  //Object creation//
		
		m.addition();
		m.addition1(30,60);
		m.addition1(20,40);
		
		

	}

	
	public void addition()	//Without Parameters//
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("Addition is "+sum);
	
	}
	
	public void addition1(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		
	}
	
}
