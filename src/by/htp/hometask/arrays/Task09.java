package by.htp.hometask.arrays;

/*9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. */

public class Task09 {

	public static void main(String[] args) {
		int[] ar = {-3,4,0,3,-4,1,6,5,-1,0};
		int max;
		int min;
		int indexmax;
		int indexmin;
		int temp;
		
		max = ar[0];
		min = ar[0];
		
		for(int i=0; i<ar.length; i++ ) {
			System.out.print(ar[i] + " ");
		}
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
				indexmax = i;
			}
		}
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i] < min) {
				min = ar[i];
				indexmin = i;
			}
		}
		
		for (int i=0; i<ar.length; i++) {
			if (ar[i] == max){
				ar[i]= min;
			} else if(ar[i] == min) {
				ar[i] = max;
			}
		}
		System.out.println("");
		for(int i=0; i<ar.length; i++ ) {
			System.out.print(ar[i] + " ");
		}
		
	}

}
