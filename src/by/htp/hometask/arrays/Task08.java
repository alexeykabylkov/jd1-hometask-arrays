package by.htp.hometask.arrays;

/*8. Дан массив действительных чисел, размерность которого N. 
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. */

public class Task08 {

	public static void main(String[] args) {
		int[] ar = {-3,4,0,3,-4,1,6,5,-1,0};
		int zero = 0;
		int less = 0;
		int more = 0;
		
		for(int i=0; i<ar.length; i++ ) {
			if (ar[i] < 0) {less++;}
			else if (ar[i] > 0) {more++;}
			else if (ar[i] == 0) {zero++;}
		}
		
		System.out.println(less + " negative elements");
		System.out.println(more + " positive elements");
		System.out.println(zero + " = 0");

	}

}
