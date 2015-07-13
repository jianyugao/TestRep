package bytedetect;

public class bytetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b = {0x00,0x10};
		int a = getStatus(b);
		if (a == 16) {
			System.out.println("this is 256");
		}
		
		if ((a & 0xff)==16 ) {
			System.out.println("this is ff256");
		}
	}
	public static int getStatus(byte[] originInByte) {
		byte[] status = new byte[2];
	//	int posLast = 18; // status byte is the 18th from end to front in the
							// originInbyte;
	//	int length = 0;
		int statusValue = 0;
		//length = originInByte.length;
		status[0] = originInByte[0];
		status[1] = originInByte[1];
		statusValue = (((status[0] << 8) & 0x00ff) | (status[1] & 0x00ff));
		return statusValue;

	}

}
