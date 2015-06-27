
import java.util.Scanner;


/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int array[] = new int[10];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			int num1 = 0;
			int num2 = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i]%2 == 0) {
//					array1[i] = array[i];
					num1++;
				}else {
//					array2[i] = array[i];
					num2++;
				}
			}
			int array1[] = new int[num1];
			int array2[] = new int[num2];
			num1 = 0;
			num2 = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i]%2 == 0) {
					array1[num1] = array[i];
					num1++;
				}else {
					array2[num2] = array[i];
					num2++;
				}
			}
			
			sort(array2,1);
			sort(array1, 2);
			String aa = "";
			for (Integer integer : array2) {
				aa += integer+" ";
			}
			for (Integer integer : array1) {
				aa += integer+" ";
			}
			System.out.println(aa.trim());
		}
	}

	/**
	 * @Description: TODO
	 *
	 * @date 2013-8-8,上午11:22:32
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @param array1
	 * @param i
	 */
	private static void sort(int[] array1, int num) {
		
		for (int i = 0; i < array1.length-1; i++) {
			for (int j = 0; j < array1.length-1-i; j++) {
				if (num == 1) {
					if (array1[j]<array1[j+1]) {
						int temp = array1[j];
						array1[j] = array1[j+1];
						array1[j+1] = temp;
					}
				}else if (num == 2){
					if (array1[j]>array1[j+1]) {
						int temp = array1[j];
						array1[j] = array1[j+1];
						array1[j+1] = temp;
					}
				}
			}
		}
	}
}	

/**************************************************************
	Problem: 1117
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1050 ms
	Memory:97820 kb
****************************************************************/


                        