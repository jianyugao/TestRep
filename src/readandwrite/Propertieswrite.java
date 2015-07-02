package readandwrite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Propertieswrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("/write.properties");
			properties.setProperty("name", "gary");
			properties.setProperty("sex", "man");
			properties.setProperty("age", "22");
			properties.store(outputStream, null);
			
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		}finally{
			if (null!= outputStream) {
				try {
					outputStream.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
