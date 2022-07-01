package constructor;

public class constructor_with_parameters2 {

	
	int s;
	int l;
	int w;
	int a;
	int b;
	int c;
	float h;
	float r;
	float n;
	
	public constructor_with_parameters2(int d)
	{
		s=d;
	}
	public constructor_with_parameters2(int e, int f)
	{
		l=e;
		w=f;
	}
	public constructor_with_parameters2( int j, float i)
	{
		b=j;
		h=i;
	}
	public constructor_with_parameters2(float k, float m)
	{
		r=k;
		n=m;
	}
	public static void main(String[] args)
	{
		constructor_with_parameters2 object=new constructor_with_parameters2(5);
		object.square();
		
		constructor_with_parameters2 object1=new constructor_with_parameters2(5, 5);
		object1.rectangle();
		
		constructor_with_parameters2 object2=new constructor_with_parameters2(5, 5f);
		object2.triangle();
		
		constructor_with_parameters2 object3=new constructor_with_parameters2(2f, 3.14f);
		object3.circle();		
		
	}
	
	public void square()
	{
		float area=s*s;
		System.out.println("The area of square is "+area);
	}
	public void rectangle()
	{
		float area=2*l+2*w;
		System.out.println("The area of rectangle is "+area);
	}
	public void triangle()
	{
		double area=0.5*b*h;
		System.out.println("The area of triangle is "+area);
	}
	public void circle()
	{
		double area=n*r*r;
		System.out.println("The area of circle is "+area);
	}
}

