
public class StringBuffer1 {

	public static void main(String[] args) {
		 
		StringBuffer sb=new StringBuffer("HELLO");
		StringBuffer sb1=new StringBuffer(sb);
		
		System.out.println(sb);
		System.out.println(sb1);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.append("HI"));
		sb.setLength(2);
		
		System.out.println(sb);
		
		sb.insert(1, "XYZ");
		System.out.println(sb);
		
		sb.setCharAt(1,'M');
		System.out.println(sb);
		sb.replace(1, 3, "END");
		System.out.println(sb);

	}

}
