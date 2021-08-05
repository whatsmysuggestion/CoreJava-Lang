
public class ObjectExample1{
	
	int n=1;
	public boolean equals(ObjectExample1 o)
	{
		if(o instanceof ObjectExample1)
		return true;
		else
		 
		return false;
	}
	
	public int hashCode()
	{
		return  n++;
	}
	
	 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 
		ObjectExample1 oe=new ObjectExample1();
		ObjectExample1 oe1=new ObjectExample1();
		
		System.out.println(oe.equals(oe1));
		
		System.out.println(oe.hashCode());
		System.out.println(oe1.hashCode());
		
	 
	}
	
}


