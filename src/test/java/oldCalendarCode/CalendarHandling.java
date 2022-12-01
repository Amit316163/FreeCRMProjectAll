package oldCalendarCode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarHandling {

	public static void main(String[] args) throws Exception  {


		//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
		//		Date date = new Date();  
		//		System.out.println(formatter.format(date)); 

		//Validate the given input (31-Oct-2022)
		//Select the date of current month and current year 
		//Select the date of future month and future year
		//Select the date of past month and past year

		//				String userInput="31-Oct-2022";
		//				SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		//				simpleDateFormat.setLenient(false);
		//				Date formattedDate=simpleDateFormat.parse(userInput);
		//				System.out.println(formattedDate);

		String userInput="31-October-2022";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		Date formattedGivenDate;
		try {
			simpleDateFormat.setLenient(false);
			formattedGivenDate = simpleDateFormat.parse(userInput);
			System.out.println(formattedGivenDate);

			//We can use this but this is Deprecated method from Date class.
			//			formattedGivenDate.getDay();		
			//			formattedGivenDate.getMonth();
			//			formattedGivenDate.getYear();

			//Now java providing Calendar class (Abstract class) using this we can get day,Month and year
			Calendar calendar=	Calendar.getInstance();
			calendar.setTime(formattedGivenDate);
			int givenDay=	calendar.get(Calendar.DAY_OF_MONTH);
			int givenMonth=	calendar.get(Calendar.MONTH);
			int givenYear=	calendar.get(Calendar.YEAR);
			
			


		} catch (ParseException e) {

			throw new Exception("Given date is invalid...Please provide the correct date ");
		}




	}

}
