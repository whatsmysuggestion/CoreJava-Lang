public class StringExample4 {
	public static void main(String[] args) { 
		
		
		  String s="HELLOO"; 
		  char ch[]=s.toCharArray(); 
		  for(int i=0;i<ch.length;i++)
		  System.out.println(ch[i]);
		  
		  
		  
		  System.out.println("<------------------------------------------------->");
		 
		
		
		
		  char ch1[]=new char[10];
		  
		  String s1="HELLO";
		  
		  s1.getChars(0, s1.length(), ch1, 3);
		  
		  for(int j=0;j<ch1.length;j++) 
		  { 
			  System.out.println(ch1[j]);
		  
		  }
		 
		 
		
		
		}

}
