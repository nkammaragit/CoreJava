package exceptions_CheckedCompiletime_Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionTest {
	
	public void readFile() throws FileNotFoundException,ArithmeticException{
		
		FileInputStream fis = new FileInputStream("E:/OneDrive/Desktop/Test.xlsx");
	}

}
