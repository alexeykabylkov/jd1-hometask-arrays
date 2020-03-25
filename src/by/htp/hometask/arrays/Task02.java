package by.htp.hometask.arrays;

/*2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. */

public class Task02 {

	public static void main(String[] args) {
		int a[] = {3,0,5,6,3,0,6,4,0,4,3,0};
		int k = 0;
		int j = 0;
		
		for (int i=0; i<a.length; i++) {
			if (a[i] == 0) {
				j++;
			}
		}
		
		int b[] = new int[j];
		
		for (int i=0; i<a.length; i++) {
			if (a[i] == 0) {
				b[k] = i;
				k++;
			}
		}

		for (k=0; k<b.length; k++) {
			System.out.print(b[k] + " ");
		}

	}

}
