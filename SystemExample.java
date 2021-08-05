public class SystemExample {

	public static void main(String[] args) throws Exception {
		  
		
		/*
		 * System.out.println("Valid Message"); System.err.print("Error Message");
		 * 
		 * System.gc();
		 */
		  System.out.println("enter a character");
		  
		  int a=System.in.read(); 
		  System.out.println(a);
		  
		  if((char)a=='e') 
			  System.exit(0);
		  else
			  System.out.println("Normal Ending");
		  
		 
		 
		 
		 
	}
}
