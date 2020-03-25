package by.htp.hometask.arrays;

/*15. Дана последовательность действительных чисел n aaa , ,, 21  . Указать те ее элементы, 
 * которые принадлежат отрезку [с, d]. */

public class Task15 {

	public static void main(String[] args) {
		int[] ar = {3,3,4,0,9,7,8,6,5,1};
		
		int c = 6;
		int d = 9;
		
		System.out.print("Index of elements = ");
		for(int i=0; i<ar.length; i++) {
			if (ar[i]>=c && ar[i]<=d) {
				System.out.print(i +  ", ");
			}
		}
	}

}
