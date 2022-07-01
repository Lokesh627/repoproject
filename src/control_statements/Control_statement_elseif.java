package control_statements;

public class Control_statement_elseif {

	public static void main(String[] args) 
	{	//If Marks are greater than or equal to 75--> Distinction
		//If marks are greater than or equal to 66--> First Class
		//If marks are greater than or equal to 40--> Pass
		//If marks are less than 40--> Fail
		
		int marks=38;
		
		if(marks>=75)
		{
			System.out.println("You are in Distinction");
		}
		
		else if (marks>=66)
		{
			System.out.println("You are First class");
		}
		
		else if (marks>=40)
		{
			System.out.println("You are Pass");
		}
		
		else if (marks<40)
		{
			System.out.println("You are Fail");
		}
		

	}

}
