package by.htp.hometask.arrays;

/*3. Дана последовательность целых чисел а1 а2,..., аn . 
 * Выяснить, какое число встречается раньше - положительное или отрицательное. */

public class Task03 {

	public static void main(String[] args) {
		
		int[] ar = {0,5,5,3,5,4,2};
		
		if (ar[0] >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}

}
