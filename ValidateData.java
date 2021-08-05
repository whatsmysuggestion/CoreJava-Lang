
public class ValidateData {

	
	public static void main(String[] args) {
		
		
		try {
		int  a=Integer.parseInt(args[0]);
		System.out.println("Entered Input is a Number");
		}
		catch(Exception e)
		{
			System.out.println("Entered Input is a Character");
		}
 
		
	}
}
