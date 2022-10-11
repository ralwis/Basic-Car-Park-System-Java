package car_park_assignment_en19384634;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTime{
	private Date date;

	public DateTime(Date date) {
		this.date = date;
	}

	public void datetime(){
		
		DateFormat df =new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println("    Date and Time --------------"+ df.format(date));

	}

}

