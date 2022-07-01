package methods;

public class Method_with_parameters2 {

	public static void main(String[] args) {
		batchinfo1();
		batchinfo1();
		
		
		
		
		
		Method_with_parameters2 method= new Method_with_parameters2();  //Object Creation//
		method.batchinfo2("Parag", "Pune", "Electronics", 76.24f);
		method.batchinfo2("Mayuresh", "Pune", "Mech", 80.60f);
		
	}

	public static void batchinfo1() //(Name, Dist, Branch,Percentage)//
	
	{//Without parameters//
		String name="Parag";
		String dist="Pune";
		String branch="Electronics";
		float percentage= 75.24f;
		
		System.out.println("My name is "+name);
		System.out.println("My dist is "+dist);
		System.out.println("My branch is "+branch);
		System.out.println("My percentage are "+percentage);
	}
	
	public void batchinfo2(String name, String dist, String branch, float percentage)
	{
		System.out.println("My name is "+name);
		System.out.println("My dist is "+dist);
		System.out.println("My branch is "+branch);
		System.out.println("My percentage are "+percentage);
	}
}
