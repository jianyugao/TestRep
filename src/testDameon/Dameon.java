package testDameon;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class Dameon {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		int times = 0;
		PrintWriter out = new PrintWriter("/home/gary/Desktop/writertest.txt");
		while(true){
			times++;
			String test = "Dameon cry"+times;
			System.out.println("Dameon testing is running");	
			out.println(test);
			TimeUnit.MILLISECONDS.sleep(1000);
			out.close();
		}
	}

}
