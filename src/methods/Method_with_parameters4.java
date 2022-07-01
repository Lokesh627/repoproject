package methods;

public class Method_with_parameters4 {

	public static void main(String[] args)
	{
		Method_with_parameters4 object=new Method_with_parameters4();
		
		formulea();
		object.formulea2(2, 2, 2, 2, 2, 2, 2,2, 3.14f);
	
	}
	
	
	public static void formulea()
	{
		//Square//
		int s=2;
		double perimeter=4*s;
		double area=s*s;
		System.out.println("Perimeter of Square is "+perimeter);
		System.out.println("Area of Square is "+area);
		
		//Rectangle//
		int w=3;
		int l=4;
		double perimeter1=2*w+2*l;
		double area1=l*w;
		System.out.println("Perimeter of Rectangle is "+perimeter1);
		System.out.println("Area of Rectangle is "+area1);
		
		//Triangle//
		int a=2;
		int b=3;
		int c=2;
		float h=2.5f;
		double perimeter2=a+b+c;
		double area2=0.5*h*b;
		System.out.println("Perimeter of Triangle is "+perimeter2);
		System.out.println("Area of Triangle is "+area2);		
		
		//Circle//
		int r=4;
		float n=3.14f;
		int d=2*r;
		double circumference=d*r;
		double area3=r*r*n;
		System.out.println("Circumference of Circle is "+circumference);
		System.out.println("Area of Circle is "+area3);
	}

	public void formulea2(int s, int w, int l, int a, int b, int c, int h, int r, float n)
	{
		double perimeter=4*s;	//Square//
		double area=s*s;
		System.out.println("Perimeter of Square is "+perimeter);
		System.out.println("Area of Square is "+area);
		
		double perimeter1=2*w+2*l;	//Rectangle//
		double area1=l*w;
		System.out.println("Perimeter of Rectangle is "+perimeter1);
		System.out.println("Area of Rectangle is "+area1);
		
		double perimeter2=a+b+c;	//Triangle//
		double area2=0.5*b*h;
		System.out.println("Perimeter of Triangle is "+perimeter2);
		System.out.println("Area of Triangle is "+area2);	
		
		double diameter=2*r;	//Circle//
		double circumference=2*diameter;
		double area3=r*r*n;
		System.out.println("Circumference of Circle is "+circumference);
		System.out.println("Area of Circle is "+area3);
		
	}
}
