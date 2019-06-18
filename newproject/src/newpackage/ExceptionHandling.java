package newpackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Am before try block");
		try {
		System.out.println("Am inside try block");	
		int a = 10/0;
		System.out.println(a);
		System.out.println("Am after the exception"); 
		}catch(Exception e)
		{
			System.out.println("Am in catch block");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 System.out.println("Am outside of try and catch block");
		 System.out.println("Continue with rest of the program");
		 
	}

}
