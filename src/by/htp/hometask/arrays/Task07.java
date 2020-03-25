package by.htp.hometask.arrays;

/*7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен. */
import java.util.Random;
public class Task07 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] ar = new int[10];
		int z = 4;
		int x = 0;
		int count = 0;
		
		for(int i=0; i<ar.length; i++ ) {
			ar[i] = r.nextInt(10);
			System.out.print(ar[i] + " ");
		}
		
		System.out.println("");
		
		for(int i=0; i<ar.length; i++ ) {
			if (ar[i] > z) {
				ar[i] = x;
				count++;
			}
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
		System.out.println("amount = " + count);

	}

}
