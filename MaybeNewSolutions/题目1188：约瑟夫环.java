
import java.util.Scanner;

public class Main {
	/*
     * 1188
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        	int array[] = new int[3001];
            for (int i = 0; i < array.length; i++) {
    			array[i] = i;
    		}
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            int count1 = 0;
            int count2 = 0;
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i <= n; i++) {
				if (array[i] != 0) {
					count1++;
				}
				if (count1 == p) {
					count2++;
					if (count2 == n) {
//						System.out.println(i);
						sb.append(i);
						break;
					}else {
//						System.out.println(i);
						sb.append(i+" ");
					}
					array[i] = 0;
					count1 = 0;
				}
				if (i == n) {
					i = 0;
				}
			}
            System.out.println(sb.toString());
        }
    }
}
/**************************************************************
	Problem: 1188
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:420 ms
	Memory:49972 kb
****************************************************************/


                        