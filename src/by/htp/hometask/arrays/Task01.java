package by.htp.hometask.arrays;

/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. */

public class Task01 {

	public static void main(String[] args) {
		int[] a = {5,15,4,7,5,4,4,6,4,3,6};
		int k = 2;
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			if (a[i] % k == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("sum = " + sum);

	}

}
