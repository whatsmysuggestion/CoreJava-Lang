
public class StringBuffer2 {

	public static void main(String[] args) {
	 
		
		StringBuffer sb=new StringBuffer("HELLO");
	
		
		System.out.println(sb.substring(1));
		System.out.println(sb.subSequence(1, 3));
		System.out.println(sb.delete(1, 3));
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		

	}

}
