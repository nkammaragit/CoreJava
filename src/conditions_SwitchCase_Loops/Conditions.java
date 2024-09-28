package conditions_SwitchCase_Loops;

public class Conditions {

	public static void main(String[] args) {

		Conditions cond = new Conditions();
	
		cond.checkGrade(95,"Hari");

		
//		checkEligibility(15);
//		checkGrage(35);
	}

	//Instance method : If else ladder contions
	public void checkGrade(int marks, String sName) {
		if(marks >=90) {
			System.out.println("You got a grade A  : " + sName);
			if(marks >=95) {
				System.out.println("You are Excellent " + sName);
			}
		}
		else if(marks >=80) {
			System.out.println("You got a grade B : " + sName);
		}

		else if(marks >= 70) {
			System.out.println("You got a grade C : " + sName);
		}

		else if(marks >=35) {
			System.out.println("You are passed : " + sName);
		}
		
		else {
			
			System.out.println("You are Failed : " + sName);

		}

	}



	//Static method : If else condtion using 
//		public static void checkEligibility(int age) {
//			if(age > 18) {
//				System.out.println("You are eligible to vote");
//			}
//			else {
//				System.out.println("You are NOT eligible to vote");
//	
//			}
//			
//		}
}
