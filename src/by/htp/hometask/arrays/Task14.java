package by.htp.hometask.arrays;

/*14. Дан одномерный массив A[N]. Найти:  */

public class Task14 {

	public static void main(String[] args) {
		int[] ar = {3,3,4,0,9,7,8,6,5,1};
		int max;
		int min;
		max = ar[2];
		min = ar[1];
		int sum;
		
		
		for(int i=0; i<ar.length; i=i+2) {
			if (ar[i]>max) {
				max = ar[i];
			}
		}
		
		for(int i=1; i<ar.length; i=i+2) {
			if (ar[i]<min) {
				min = ar[i];
			}
		}
		sum = min + max;
		System.out.println("sum (max, min) = " + sum);

	}

}
