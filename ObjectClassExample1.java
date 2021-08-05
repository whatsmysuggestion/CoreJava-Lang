
public class ObjectClassExample1 {
	
	int no=1;
	String name="test";
	
		 
		public String toString() {
			  
			return "Name Is:-"+this.name+" No:-"+this.no;
		}

	public static void main(String[] args) throws Exception {
		 
		ObjectClassExample1 oe=new ObjectClassExample1();
	 
		System.out.println(oe);		
		
		
	}

}
