public class IntegerExample {
public static void main(String[] args) {	
		
		  int a=10;
		  Integer i=new Integer(a); 
		  System.out.println(i);	
		
		  String b="20";
		  Integer ii=new Integer(b);
		  System.out.println(ii);		  
		  
		  System.out.println(Integer.parseInt(b));
		  System.out.println(Integer.valueOf(b));		  	  
		  
		  Integer i2=new Integer(10)+new Integer(20);
		  System.out.println(i2);	 
		
		
		  System.out.println(Integer.MAX_VALUE);
		  System.out.println(Integer.MIN_VALUE);
		 		 
		
		  System.out.println(Integer.toHexString(10));
		  System.out.println(Integer.toOctalString(10));
		  System.out.println(Integer.toBinaryString(10));
		 	 
	}
}
