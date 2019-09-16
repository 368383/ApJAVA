package quarter1;

public class oddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum =0;
		for (int i = 100; i <= 1000; i++) {
			if(i%2==0) {
			evenSum = i + evenSum;
			}
			if(i%2==1) {
				System.out.println("odd number is "+i);
			}
		}
		System.out.println("EVEN SUM " +evenSum);
	}

}
