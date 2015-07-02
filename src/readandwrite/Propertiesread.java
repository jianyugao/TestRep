package readandwrite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Propertiesread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream inputStream = Propertiesread.class.getResourceAsStream("read.properties");
		//System.out.println("this is inputstream"+inputStream.toString());
		prop.load(inputStream);
		inputStream.close();
		String teString = prop.getProperty("DEVICE_KEYS");
		System.out.println("this is testring"+teString);
	}

}
