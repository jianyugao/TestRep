package lambda;

import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

public class Lambda {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str = "this is lamdba";
//		str->{System.out.println(str);};
		BiFunction<Integer, Integer, Integer> addition = (x, y) -> x+y;
		System.out.println( "calling addition of 2 and 3 resulting: " + addition.apply( 2, 3 ) );
	while(true){
		System.out.println("this is lambdadada");
		TimeUnit.MILLISECONDS.sleep(1000);
	}
	}

}
