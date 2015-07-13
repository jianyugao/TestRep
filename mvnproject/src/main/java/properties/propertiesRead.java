package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * How can you read a properties file in java. The advantage of properties file is you can modify this file any time
 * and you won't need to restart you program.
 * @author gary
 *
 */
public class propertiesRead {
	public static void main(String[] args) {
		while(true){
			
		String testString = "TEST_STRING";
		Properties prop = new Properties();
		InputStream in = propertiesRead.class.getResourceAsStream("/propertiesRead.properties");
		try {
		prop.load(in);
		System.out.println(prop.getProperty(testString));
		System.out.println(staticFile.HAHA);
		in.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			TimeUnit.MILLISECONDS.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}