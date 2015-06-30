
// 题目1516：调整数组顺序使奇数位于偶数前面

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1516
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     * 1516
     */
public static void main(String[] args) throws Exception{
    	StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
            	st.nextToken();
                array[i] = (int) st.nval;
            }
            List<Integer> arrList1 = new ArrayList<Integer>();
            List<Integer> arrList2 = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (array[i]%2!=0) {
                    arrList1.add(array[i]);
                }else {
                    arrList2.add(array[i]);
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrList1.size(); i++) {
            	sb.append(arrList1.get(i)+" ");
            }
            for (int i = 0; i < arrList2.size(); i++) {
            	sb.append(arrList2.get(i)+" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}

/**************************************************************
 Problem: 1516
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:940 ms
 Memory:60092 kb
 ****************************************************************/




