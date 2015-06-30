
// 题目1429：Sequence Transformation

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1429
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    /*
     * 1529
     */
public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int t = (int) st.nval;
        	while (t > 0) {
        		Set<Integer> numSet = new HashSet<Integer>();
        		Map<Integer, Integer> numMap1 = new HashMap<Integer, Integer>();
        		st.nextToken();
        		int n = (int) st.nval;
        		int arrayA[] = new int[n];
        		int sum1 = 0;
        		for (int i = 0; i < n; i++) {
					st.nextToken();
					arrayA[i] = (int) st.nval;
					sum1 += arrayA[i];
					if (numMap1.containsKey(sum1)) {
						int count = numMap1.get(sum1);
						numMap1.put(sum1, count+1);
					}else {
						numMap1.put(sum1, 1);
					}
					numSet.add(sum1);
				}
        		Map<Integer, Integer> numMap2 = new HashMap<Integer, Integer>();
        		int arrayB[] = new int[n];
        		int sumArrB[] = new int[n];
        		int sum2 = 0;
        		for (int i = 0; i < n; i++) {
					st.nextToken();
					arrayB[i] = (int) st.nval;
					sum2 += arrayB[i];
					sumArrB[i] += sum2;
					if (numMap2.containsKey(sum2)) {
						int count = numMap2.get(sum2);
						numMap2.put(sum2, count+1);
					}else {
						numMap2.put(sum2, 1);
					}
				}
        		
        		if (sum1 != sum2) {
					System.out.println("no");
				}else {
					boolean flag = true;
					for (int num : numSet) {
						if (!numMap1.containsKey(num)||!numMap2.containsKey(num)) {
							flag = false;
							break;
						}else {
							int count1 = numMap1.get(num);
							int count2 = numMap2.get(num);
							if (count1 != count2) {
								flag = false;
//								System.out.println("no");
								break;
							}
						}
					}
					if (flag) {
						System.out.println("yes");
					}else {
						System.out.println("no");
					}
				}
				t --;
			}
        }
    }}
/**************************************************************
 Problem: 1429
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14788 kb
 ****************************************************************/




