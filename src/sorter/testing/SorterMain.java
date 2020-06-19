package sorter.testing;

import java.util.ArrayList;

public class SorterMain {

	static String sortMe = "594687132";
	
	public static void main(String[] args) {
		
		int[] sortInt = new int[sortMe.length()];
		int[] sorted = new int[sortInt.length];
		ArrayList<Integer> stillIn = new ArrayList<Integer>(); 
		
		for (int i = 0; i < sortInt.length; i++) {
			sortInt[i] = new Integer(sortMe.substring(i, i + 1));
			stillIn.add(sortInt[i]);
		}

		int curentInt = 0;
		for (int i = 0; i < sortInt.length; i++) {
			if(curentInt > sortInt[i]) {
				curentInt = sortInt[i];
			}
			sorted[i] = curentInt;
			for (int j = 0; j < stillIn.size(); j++) {
				if (stillIn.get(j) == sortInt[i]) {
					stillIn.remove(j);
				}
			}
			System.out.println(stillIn.toString());
		}
		
		System.out.println("Sort Length = " + sortInt.length);
		System.out.println(sorted.length);
		
		for (int i = 0; i < sortInt.length; i++) {
			System.out.print(sortInt[i] + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	}
	
}
