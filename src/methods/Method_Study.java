package methods;

public class Method_Study {

	public static void main(String[] args) {
		Method_Study mayur=new Method_Study();
		mayur.add();
		
		sub(); //calling static method from same class--> call using method name()//
		Method_Study_1.mul(); //calling static method from another class-->call using classname.methodname();//
		
		

	}
	public void add() //non static regular method//
	{
		int a;
		int b;
		a=200;
		b=120;
		int sum;
		sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	
	
	public static void sub() //static regular method//
	{
		int a;
		int b;
		a=200;
		b=120;
		int sub=a-b;
		System.out.println("Sub is "+sub);	
		
	}
}
