package by.htp.hometask.arrays;

/* Дана последовательность целых чисел n aa a , ,, 21  . Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны ) ,, ,min( 21 n aaa  . */

public class Task17 {

	public static void main(String[] args) {
		
		int[] ar = {3,1,4,1,9,7,8,6,5,1};
		int min;
		min = ar[0];
		int k = 0;
		int j = 0;
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		
		for (int i=0; i<ar.length; i++) {
			if (ar[i]==min) {
				k++;
			}
		}
		
		int[] mas = new int[ar.length-k];
		
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i]!=min) {
				mas[j] = ar[i];
				j++;
			}
		}
		
		for(j=0; j<mas.length; j++) {
			System.out.print(mas[j] + " ");
		}

	}

}
