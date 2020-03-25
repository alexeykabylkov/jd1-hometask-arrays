package by.htp.hometask.arrays;

/*11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, 
 * у которых остаток от деления на М равен L (0 < L < М-1). */

public class Task11 {

	public static void main(String[] args) {
		
		int[] ar = {13,13,14,10,19,17,18,16,15,11,10};
		int m = 5;
		
		for(int i=0; i<ar.length; i++) {
			if (ar[i]%m>0 && ar[i]%m<m-1) {
				System.out.print(ar[i] + " ");
			}
		}

	}

}
