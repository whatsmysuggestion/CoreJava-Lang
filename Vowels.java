
public class Vowels 
{
	
	public static void main(String[] args) {

		int totalV=0;
		String s = "Hello Welcome To My Program";
            int templen = s.length();
            for(int i = 0; i<templen; i++)
            {
            	char c = s.charAt(i);
            	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            	{
            		totalV++;
            	}

            }
            
            
      
		
		System.out.println("Total number of lower case vowels: "+ totalV);
		

	}

}
