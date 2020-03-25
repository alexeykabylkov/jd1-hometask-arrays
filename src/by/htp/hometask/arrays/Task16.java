package by.htp.hometask.arrays;

/*16. Даны действительные числа n aa a , ,, 21  . Найти */

public class Task16 {

	public static void main(String[] args) {
		
		int[] ar = {3,3,4,0,9,7,8,6,5,1};
		int max;
		max = ar[0] + ar[1];
		
		for(int i=0; i<ar.length-1; i++) {
			if((ar[i]+ar[i+1])>max) {
				max = ar[i]+ar[i+1];
			}
		}
		System.out.println(max);

	}

}
