package by.htp.hometask.arrays;

/*10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. */

public class Task10 {

	public static void main(String[] args) {
		int[] ar = {3,3,4,0,9,4,8,6,5,1,0};
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > i) {
				System.out.print(ar[i] + " ");
			}
		}

	}

}
