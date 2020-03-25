package by.htp.hometask.arrays;

/*6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. */

public class Task06 {

	public static void main(String[] args) {
		int[] ar = {3,4,2,3,4,1,6,5,1,9};
		int max;
		int min;
		int dist;
		max = ar[0];
		min = ar[0];
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		
		dist = max-min;
		System.out.println("distance = " + dist);

	}

}
