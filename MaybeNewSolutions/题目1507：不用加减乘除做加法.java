
import java.util.Scanner;

public class Main {
	/*
	 * 1478
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int num = addAB(a , b);
			System.out.println(num);
		}
	}

	private static int addAB(int a, int b) {
		if(b == 0)  
	        return a;  
	    if(a == 0)  
	        return b;  
	    int sum = a ^ b;  //不记进位的和  
	    int carry = (a & b)<<1; //进位  
	    return addAB(sum,carry);  
	}
}

/**************************************************************
	Problem: 1507
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:720 ms
	Memory:26972 kb
****************************************************************/


                        