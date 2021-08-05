 


public class StringExample {

	public static void main(String[] args) throws Exception {
		
		String s="HELLO";//literal	
		String s1=new String("HELLO");//parameterized constructor		
		String s2=new String(s1);//copy constructor				
		
		String s4=new String("HI");	
		
 
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		
		  System.out.println(s.hashCode());
		  System.out.println(s1.hashCode());
		  System.out.println(s2.hashCode());
		  System.out.println(s4.hashCode());
		 
 
		


	}

}
