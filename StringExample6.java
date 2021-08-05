
public class StringExample6 {
	
	public static void main(String[] args) {
		
		
		//123,test,12.3
		String s="H:E:L:L:O";
		
		String ss[]=s.split(":");
		
		for(int i=0;i<ss.length;i++)
			System.out.println(ss[i]);
		
	}

}
