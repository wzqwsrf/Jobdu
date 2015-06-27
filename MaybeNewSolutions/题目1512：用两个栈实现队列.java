
import java.util.Scanner;
import java.util.Stack;

public class Main {
	/*
	 * 1512
	 */
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String n = scanner.nextLine().trim();
			int numN = Integer.parseInt(n);
			Stack<Integer> stack1 = new Stack<Integer>();
			Stack<Integer> stack2 = new Stack<Integer>();
			for (int i = 0; i < numN; i++) {
				String a = scanner.nextLine().trim();
				if (a.equals("POP")) {
					if (stack2.isEmpty()) {
						while(!stack1.isEmpty()){
							stack2.push(stack1.pop());
						}
					}
					if (stack2.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack2.pop());
					}
				}
				if (a.contains("PUSH")) {
					int tempNum = Integer.parseInt(a.substring(5));
					stack1.push(tempNum);
				}
			}
		}
	}
}
/**************************************************************
	Problem: 1512
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2360 ms
	Memory:118488 kb
****************************************************************/


                        