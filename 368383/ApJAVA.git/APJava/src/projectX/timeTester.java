package projectX;

import java.util.concurrent.TimeUnit;

public class timeTester {
	public static void main(String[] args) throws InterruptedException {
		long current = System.currentTimeMillis() / 1000;
		TimeUnit.MILLISECONDS.sleep(5000);
		System.out.println(System.currentTimeMillis() / 1000 - current);

	}
}
