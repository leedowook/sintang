package d0531;
import java.util.Calendar;
public class calendar {

	public static void main(String[] args) {
		Calendar 지금=Calendar.getInstance();
		int year=지금.get(Calendar.YEAR);
		int month=지금.get(Calendar.MONTH)+1;
		int day=지금.get(Calendar.DAY_OF_MONTH);
		int week=지금.get(Calendar.DAY_OF_WEEK);
		int hour=지금.get(Calendar.HOUR);
		System.out.println(year);
		System.out.println(month);
	}

}
