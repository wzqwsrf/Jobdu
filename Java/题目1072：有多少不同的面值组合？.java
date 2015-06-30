
// 题目1072：有多少不同的面值组合？

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1072
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1072
     */
public static void main(String[] args) {
    	
    	int a = 8;
    	int b = 10;
    	int c = 18;
    	List<Integer> arrayList = new ArrayList<Integer>();
    	int result = 0;
    	for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 4; j++) {
				for (int k = 0; k <= 6; k++) {
					result = a*i+b*j+c*k;
					if (!arrayList.contains(result)) {
						arrayList.add(result);
					}
				}
			}
		}
    	System.out.println(arrayList.size()-1);
    }}
/**************************************************************
 Problem: 1072
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14540 kb
 ****************************************************************/




