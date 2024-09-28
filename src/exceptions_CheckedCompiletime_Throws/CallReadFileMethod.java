package exceptions_CheckedCompiletime_Throws;

import java.io.FileNotFoundException;

public class CallReadFileMethod {

	public static void main(String[] args) {
		CompileTimeExceptionTest ctet = new CompileTimeExceptionTest();
		
		try {
			ctet.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
