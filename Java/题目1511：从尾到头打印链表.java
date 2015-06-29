
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;
 
public class Main {
	/*
     * 1181
     */
	public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		Stack<Integer> stack = new Stack<Integer>();
		while (true) {
			
			st.nextToken();
		    int n = (int)st.nval;
		    if (n == -1) {
		    	break;
		    }
		    stack.push(n);
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop()+"\n");
		}
    	System.out.println(sb.toString().trim());
	}
}

/**************************************************************
	Problem: 1511
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:1050 ms
	Memory:61608 kb
****************************************************************/


                        