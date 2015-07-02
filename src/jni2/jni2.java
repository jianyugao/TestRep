package jni2;

public class jni2 {

	static{
		System.loadLibrary("ReadFile");
	}
	private native void readFile();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jni2().readFile();
	}

}
