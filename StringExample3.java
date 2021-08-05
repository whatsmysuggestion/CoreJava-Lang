public class StringExample3 {

	public static void main(String[] args) {		
		String first="HELLO";
		String second="HELLO";
		String thrird=new String("hello");
		String four="HI";	
		String five=new String("HELLO");
		
		System.out.println(first.equals(five));
		System.out.println(first.equals(thrird));	
		
		
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		System.out.println(thrird.hashCode());
		System.out.println(four.hashCode());	
		
		System.out.println(first==second);
		System.out.println(first==thrird);
		System.out.println(first==five);	
		
		System.out.println(first.equalsIgnoreCase(second));
		System.out.println(first.equalsIgnoreCase(thrird));	
		
		System.out.println(first.compareTo(second));
		System.out.println(first.compareTo(thrird));
		
	}
}
 