
public class RuntimeExample {

	public static void main(String[] args)throws Exception {
			Runtime rt=Runtime.getRuntime();   
		
		
		  
		
		/*
		 * System.out.println("FreeMemory Before GC:- "+rt.freeMemory());
		 * System.out.println("TotalMemory Before GC:- "+rt.totalMemory());
		 * 
		 * 
		 * rt.gc();
		 * 
		 * System.out.println("FreeMemory After GC:- "+rt.freeMemory());
		 * System.out.println("TotalMemory After GC:- "+rt.totalMemory());
		 * 
		 */
		 
		
			//rt.exec("notepad"); 
			rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		/*
		 * 
		 * 
		 * //
		 */
	}
}
