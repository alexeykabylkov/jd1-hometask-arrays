package by.htp.hometask.arrays;

/*12. Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами. */

public class Task12 {

	public static void main(String[] args) {
		int[] ar = {3,3,4,0,9,7,8,6,5,1};
		int k;
		int sum = 0;
		int tempsum = 0;
		
		for(int i=1; i<ar.length; i++) {
			for(k=1; k<=i; k++) {
				if (i%k!=0) {
					tempsum++;
				} else {tempsum=0;}
				
			}
			if (tempsum==0) {
				sum = sum+ar[i];
			}
		}
		System.out.println(sum);
	}

}
