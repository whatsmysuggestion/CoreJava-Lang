
public class StringBuilder1 {

	public static void main(String[] args) {
		 
		StringBuilder sb=new StringBuilder("HELLO");
		StringBuilder sb1=new StringBuilder(sb);
		
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
