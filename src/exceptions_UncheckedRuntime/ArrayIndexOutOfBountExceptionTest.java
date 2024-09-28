package exceptions_UncheckedRuntime;

public class ArrayIndexOutOfBountExceptionTest {

	public static void main(String[] args) {
		int[] arr = {1,2,35,6,7};
		
		try {
		System.out.println(arr[5]);
		}
		catch(RuntimeException t) {
			t.printStackTrace();
		}
		
		finally { //Finally always executed 
		System.out.println("Finally alwasy runs");
		}
		
		System.out.println("This line exectued");
		
	}

}
