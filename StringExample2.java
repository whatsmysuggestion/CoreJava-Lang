
public class StringExample2 {
	
	public static void main(String[] args) {
		
		String s="ABCDEFGHIJKLML";		
		System.out.println(s);
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.concat("NOPQRST"));
		
		System.out.println(s);
		
		
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(1));
		System.out.println(s.indexOf("L"));
		System.out.println(s.lastIndexOf("L"));
		System.out.println(s.startsWith("A"));
		System.out.println(s.endsWith("L"));
		System.out.println(s.contains("DEF"));		
	}

}
