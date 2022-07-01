package constructor;

public class Constructor_with_parameters4 {

	public static void main(String[] args) 
	{
		constructor_with_parameters3 Employee=new constructor_with_parameters3();
		Employee.name="Lokesh";
		Employee.Empid=10;
		Employee.Position="Dev";
		Employee.Sal=100000f;
		Employee.Gender='M';
		
		Employee.emp_info();
		
		
		constructor_with_parameters3 Employee1=new constructor_with_parameters3();
		Employee1.name="Parag";
		Employee1.Empid=16;
		Employee1.Position="Dev";
		Employee1.Sal=200000f;
		Employee1.Gender='M';
		
		Employee1.emp_info();
	}

}
