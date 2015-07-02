package mvn1.mainInput;

public class MainArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (0 != args.length) {
			for (int i = 0; i < args.length; i++) {
				switch (args[i]) {
				case "35":
					System.out.print("###############args[0] ==== 35 \n");
					break;
				case "23":
					System.out.print("###############args[1] === 23 \n");
					break;
				case "24":
					System.out.print("###############args[1] === 24 \n");
					break;
				case "25":
					System.out.print("###############args[0] ==== 25 \n");
					break;
				default:
					System.out.print("###############incorrect args");
					break;
				}
			}
		}
		
		else {
			System.out.print("###############No args in");
		}

	}

}
