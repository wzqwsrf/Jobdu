
import java.util.Scanner;

public class Main {
	
	/*
	 * 1116
	 */
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	long array[] = new long[20];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < 20; i++) {
			array[i] = i*array[i-1];
		}
        while (scanner.hasNext()) {
        	long a = scanner.nextLong();
        	String b = scanner.next();
        	if (b.equals("!")) {
        		System.out.println(array[(int) a]);
				continue;
			}
        	long c = scanner.nextLong();
        	if (b.equals("+")) {
				System.out.println(a+c);
			}else if (b.equals("-")) {
				System.out.println(a-c);
			}else if (b.equals("*")) {
				System.out.println(a*c);
			}else if (b.equals("/")) {
				if (c == 0) {
					System.out.println("error");
				}else {
					System.out.println(a/c);
				}
			}else if (b.equals("%")) {
				if (c == 0) {
					System.out.println("error");
				}else {
					System.out.println(a%c);
				}
			}
        }
    }
}
/**************************************************************
	Problem: 1116
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:820 ms
	Memory:48508 kb
****************************************************************/


                        