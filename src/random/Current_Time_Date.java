package random;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Current_Time_Date {
	public static void main(String[] args) {

		// 1.First Method
		// System.out.format("\nCurrent Date time: %tc%n\n",
		// System.currentTimeMillis());

		
		  //2. Second Method
		  Date current_Date = new Date();
		  System.out.println(current_Date);
		 

		/*
		 * 3. Third Method SimpleDateFormat formatDate = new
		 * SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		 * 
		 * Date date = new Date();
		 * 
		 * formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		 * System.out.println(formatDate.format(date));
		 */
		
		/*
		 * 4. Forth Method Date date = new Date();
		 * 
		 * LocalDateTime d = LocalDateTime.now();
		 * 
		 * ZonedDateTime UTCTime = d.atZone(ZoneId.of("UTC"));
		 * 
		 * ZonedDateTime ISTtime =
		 * UTCTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		 * 
		 * System.out.println(ISTtime);
		 */
	}
}
