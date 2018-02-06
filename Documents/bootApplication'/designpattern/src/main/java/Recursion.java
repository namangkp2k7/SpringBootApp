import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Recursion {
	public static void main(String[] args) {

		//new Recursion().calculate(10);
		getError();

	}

	public void calculate(int number) {
		if (number > 1) {
			calculate(number - 1);

		}
		System.out.println(number);
		
	}
	
	//List ls = new ArrayList();
	
	Lock lock = new ReentrantLock();
	
	public static void getError(){
		int c =1/2;
		throw new ArithmeticException("Error");
	}
}
