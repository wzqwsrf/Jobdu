
// 题目1323：World Cup Betting

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1323
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * 1323
     */
public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	String numArr[] = new String[3];
        	double result = 1;
        	for (int i = 0; i < 3; i++) {
        		Map<Double, String> keyMap = new HashMap<Double, String>();
					double w = st.nval;
					st.nextToken();
					double t = st.nval;
					st.nextToken();
					double l = st.nval;
					keyMap.put(w, "W");
					keyMap.put(t, "T");
					keyMap.put(l, "L");
					double max = w > t ? (w > l ? w : l) : (t > l ? t : l); 
					numArr[i] = keyMap.get(max);
					result *= max;
				if (i != 2 ) {
					st.nextToken();
				}
			}
        	System.out.print(numArr[0]+" "+numArr[1]+" "+numArr[2]+" ");
        	result = (double)( (result*0.65 - 1.0) * 2.0 );
        	System.out.printf("%.2f\n",result);
        }
    }
}
/**************************************************************
 Problem: 1323
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:210 ms
 Memory:14952 kb
 ****************************************************************/




