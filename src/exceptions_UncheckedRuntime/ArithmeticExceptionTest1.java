package exceptions_UncheckedRuntime;

public class ArithmeticExceptionTest1 {
	
	public static void main(String[] args) {
		
		int x = 20, y=0;
		int result = 0 ;
		
		
		
		
		try {
			
	    result = (x/y);
	    
		}
		
		catch(Exception a) {
			a.printStackTrace();
		}
	
	    System.out.println(result);
	    System.out.println("calculation is done");
	
	}

}
