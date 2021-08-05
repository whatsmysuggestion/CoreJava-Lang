public class CharacterExample {

	public static void main(String[] args) {
		  
		char c='c';
		Character ch=new Character(c);
		System.out.println(ch);
		
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.toUpperCase('c'));
		System.out.println(Character.toLowerCase('C'));
		
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println(Character.MIN_CODE_POINT);
		
	 
		

	}

}
