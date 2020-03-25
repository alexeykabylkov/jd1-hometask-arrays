package by.htp.hometask.arrays;

/*4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. */

public class Task04 {

	public static void main(String[] args) {
		int b=0;
		int[] ar = {1,2,3,4,5};
		
		for(int i=1; i<ar.length; i++) {
			if(!(ar[i]>ar[i-1])) {
				b = 0;
				//System.out.println("no");
				break;
			} else {
				b = 1;			
			}
		}
		
		if (b == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
