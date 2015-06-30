
// 题目1366：栈的压入、弹出序列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1366
 */

import java.io.StreamTokenizer;
import java.util.Stack;

public class Main {
    /*
     * 1366
     */
public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	Stack<Integer> stack = new Stack<Integer>();
        	int pushArray[] = new int[n];
        	int popArray[] = new int[n];
        	for (int i = 0; i < n; i++) {
				st.nextToken();
				int num = (int) st.nval;
				pushArray[i] = num;
			}
        	
        	for (int i = 0; i < n; i++) {
				st.nextToken();
				int num = (int) st.nval;
				popArray[i] = num;
			}
        	boolean flag = false;
        	int i = 0;
        	int j = 0;
        	while (j < n) {
        		while (stack.isEmpty() || stack.peek()!= popArray[j]) {
    				if (i == n) {
						break;
					}
    				stack.push(pushArray[i]);
    				i++ ;
    			}
        		
        		if(stack.peek()!= popArray[j]){//下一个出栈的元素不等于栈顶元素
                    break;
                }
        		stack.pop();
        		j++;
			}
        	
        	if (stack.isEmpty() && j == n) {
				flag = true;
			}
        	
        	if (flag) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
        }
    }
}
/**************************************************************
 Problem: 1366
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:760 ms
 Memory:39068 kb
 ****************************************************************/




