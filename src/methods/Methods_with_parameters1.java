package methods;

public class Methods_with_parameters1 {

	public static void main(String[] args) {
		Methods_with_parameters1 method= new Methods_with_parameters1(); //Object creation//
		method.studentsinfo("Parag", 16, "1234567890", 24, 5, 'M');
		method.studentsinfo("Poonam", 24, "0987654321", 20, 5, 'F');
		
		

	}
	
	public void studentsinfo(String name, int rollno, String mob, float age, int batch, char gender) //Method with parameters//
	
	{
		System.out.println("My name is "+name);
		System.out.println("My roll no. is "+rollno);
		System.out.println("My phn no. is "+mob);
		System.out.println("My age is "+age);
		System.out.println("My batch no. is "+batch);
		System.out.println("My gender is "+gender);
	}
}
