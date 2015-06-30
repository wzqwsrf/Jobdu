
// 题目1159：坠落的蚂蚁

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1159
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * 1159
     */
public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int arrayA[] = new int[101];
			int arrayB[] = new int[101];
			int pos = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arrayA[i] = (int)st.nval;
				st.nextToken();
				arrayB[i] = (int)st.nval;
				if (arrayB[i] == 0) {
					pos = arrayA[i];
				}
			}
			List<Integer> leftList = new ArrayList<Integer>();
			List<Integer> rightList = new ArrayList<Integer>();
			int k1 = 0;
			int k2 = 0;
			for (int i = 0; i < n; i++) {
				if (arrayA[i] < pos && arrayB[i] == 1) {
					k1++;
					leftList.add(100 - arrayA[i]) ;
				}else if (arrayA[i] > pos && arrayB[i] == -1) {
					k2++;
					rightList.add(arrayA[i]) ;
				}
			}
			if (k1 == k2) {
				System.out.println("Cannot fall!");
			}else if (k1 > k2) {
				Collections.sort(leftList);
				System.out.println(leftList.get(k2));
			}else if (k1 < k2) {
				Collections.sort(rightList);
				System.out.println(rightList.get(k1));
			}
		}	
	}}
/**************************************************************
 Problem: 1159
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:14604 kb
 ****************************************************************/




