import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		 Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("yyyy-MM-dd'T'hh:mm:ss:mili");
	      String date=ft.format(dNow);
	      System.out.println("Current Date: " + date);
	}

}
	