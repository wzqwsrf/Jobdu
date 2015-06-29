
public class Main {
	
	/*
	 * 1488
	 */
	public static void main(String[] args) {
		int begin = 1;
		int result = 1;
		for (int i = 2; i <= 30; i++) {
			begin *= 2;
			result += begin;
		}
		System.out.println(10*30+" "+result);
	}
}

/**************************************************************
	Problem: 1488
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14664 kb
****************************************************************/


                        