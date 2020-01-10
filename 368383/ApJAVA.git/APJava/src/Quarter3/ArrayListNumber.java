package Quarter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 10));
		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i) % 2 == 0)) {
				list.remove(i);
				i--;
			}
		}
		System.out.print(list.toString());

		ArrayList<Double> doubleList = new ArrayList<Double>(Arrays.asList(4.0, 5.0, 6.0, 7.0, 10.0));
		Collections.sort(doubleList);
		doubleList.remove(0);
		doubleList.remove(doubleList.size() - 1);
		System.out.print(doubleList.toString());

	}

}
