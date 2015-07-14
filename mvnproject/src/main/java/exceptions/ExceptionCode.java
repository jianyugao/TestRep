package exceptions;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

import properties.staticFile;

public class ExceptionCode {

	public static int division(int code){
		int i = -10;
		try {
//			String string= Integer.toString(code);
			System.out.println("this is code:"+code);
			i = 10/code;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//i = -10;
		}
		return i;
	}
	public static long toUnixTime(int year, int month, int dayOfMonth, int hour, int minute){
		LocalDateTime ldf = LocalDateTime.of(year, Month.of(month), dayOfMonth, hour, minute);
		return ldf.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
	}
	public static void main(String[] args) {
		
		try {
//			division(0);
//			System.out.println("in the main");
			long time = 0;
			try {
				
				time = toUnixTime(1987, 0, 23, 12, 23);
//			}catch(DateTimeException m){
//				m.printStackTrace();
			} 
			catch (Exception e) {
				// TODO: handle exception
//				e.printStackTrace();
				System.out.println("Error occurs in DecodeLogic executeDecode"+e.getMessage()+"\n Index of Raw Data list highIndex: " );
			}
			System.out.println("this is unixtime"+time+"");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
