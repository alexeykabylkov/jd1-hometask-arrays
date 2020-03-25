package by.htp.hometask.arrays;

/*5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности. 
 * Если таких чисел нет, то вывести сообщение об этом факте. */

public class Task05 {

	public static void main(String[] args) {
		int a[] = {3,1,5,5,67,1,3,5,7,3};
		int k = 0;
		int j = 0;
		
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 == 0) {
				j++;
			}
		}
		if (j==0) {System.out.println("no even numbers");}
		else {
			int b[] = new int[j];
			for (int i=0; i<a.length; i++) {
				if (a[i]%2==0) {
					b[k] = a[i];
					k++;
				}
			}
			for (k=0; k<b.length; k++) {
				System.out.print(b[k] + " ");
			}
		}

	

	}

}
