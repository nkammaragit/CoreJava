package conditions_SwitchCase_Loops;

public class SwitchCase {
	public static void main(String[] args) {
		String weekDay = getDayOfWeek(1) ;
       System.out.println(weekDay); 
	}
	
    public static String getDayOfWeek(int day) {
    	String dayOfWeek ;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
                
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        return dayOfWeek;
    }
}
