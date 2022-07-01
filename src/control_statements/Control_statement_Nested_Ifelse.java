package control_statements;

public class Control_statement_Nested_Ifelse {

	public static void main(String[] args) 
	{
		//If  Username is correct --> Enter password, If else please check username//
		//If password is correct-->Login success else invalid password//
		
		String Username="Velocity";
		String Password="Velocity@2022";
		
		if("Velocity"==Username)
		{
			System.out.println("Username is correct, Please enter password");
			
			if ("Velocity@2022"==Password)
			{
				System.out.println("Login Success");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		
		else
		{
			System.out.println("Please enter correct Username");
		}
	

	}

}
