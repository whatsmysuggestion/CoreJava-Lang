
public class HW {

	public static void main(String[] args) {
		
		String str="kamalkushow";
		
		for(int i=0;i<str.length();i++)
		{
			
			if(i%2==0)
				System.out.println(Character.toUpperCase(str.charAt(i)));
			else
				System.out.println("    "+Character.toLowerCase(str.charAt(i)));
			
		}
		
		
		

	}

}
