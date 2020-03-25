package by.htp.hometask.arrays;

/*13. Определить количество элементов последовательности натуральных чисел, 
 * кратных числу М и заключенных в промежутке от L до N. */

public class Task13 {

	public static void main(String[] args) {
		int[] ar = {3,3,4,0,9,7,8,6,5,1};
		int m = 3;
		int l = 1;
		int n = 4;
		int k = 0;
		
		for(int i=0; i<ar.length; i++) {
			if (ar[i]%m==0 && ar[i]>=l && ar[i]<=n) {
				k++;
			}
		}
		System.out.println("amount of elements = " + k);

	}

}
