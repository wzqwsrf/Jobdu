
// 题目1450：产生冠军

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1450
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1450
     */
public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			if (n == 0) {
				break;
			}
			Set<String> allNum = new HashSet<String>();
			Set<String> loserNum = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				st.nextToken(); 
                String a = st.sval;
                st.nextToken(); 
                String b = st.sval;
                allNum.add(a);
                allNum.add(b);
                loserNum.add(b);
			}
			System.out.println(allNum.size() == (loserNum.size()+1) ? "Yes" : "No");
		}
    }}

/**************************************************************
 Problem: 1450
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:230 ms
 Memory:26468 kb
 ****************************************************************/




