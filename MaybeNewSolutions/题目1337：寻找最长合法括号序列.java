
import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	/*
     * 1337
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String a = scanner.next();
            char array[] = a.toCharArray();
            int flagArr[] = new int[n];
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < n; i++) {
                if (array[i] == '(') {
                    stack.push(i);
                }else if (array[i] == ')' && !stack.isEmpty()){
                    int j = stack.pop();
                    flagArr[i] = 1;
                    flagArr[j] = 1;
                }
            }
            int maxLen = 0;
            int count = 0;
            int tempLen = 0;
            for (int i = 0; i < n; i++) {
				if (flagArr[i] == 1) {
					tempLen ++;
				}else {
					tempLen = 0;
				}
				if (tempLen > maxLen) {
					maxLen = tempLen;
					count = 1; 
				}else if (tempLen == maxLen) {
					count++;
				}
			}
            System.out.println(maxLen == 0 ? "0 1" : maxLen+" "+count);
        }
    }
}

/**************************************************************
	Problem: 1337
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2130 ms
	Memory:80436 kb
****************************************************************/


                        