
// 题目1007：奥运排序问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1007
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17175819
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * 1007
     */
public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	st.nextToken();
        	int m = (int) st.nval;
        	Map<Integer, Double[]> numMap = new HashMap<Integer, Double[]>();
        	List<Double[]> counList = new ArrayList<Double[]>();
        	for (int i = 0; i < n; i++) {
        		Double[]country = new Double[5];
        		country[0] = (double)i;
				st.nextToken();
				country[1] = (double)(int) st.nval;
				st.nextToken();
				country[2] = (double)(int) st.nval;
				st.nextToken();
				int allNum = (int) st.nval;
				country[3] = country[1]/allNum;
				country[4] = country[2]/allNum;
				numMap.put(i, country);
				counList.add(country);
			}
        	List<Integer> needNumList = new ArrayList<Integer>();
        	for (int i = 0; i < m; i++) {
				st.nextToken();
				int needNum = (int)st.nval;
				needNumList.add(needNum);
        	}
        	
        	for (int i = 0; i < m; i++) {
				int needNum = needNumList.get(i);
				Double[]country = new Double[5];
				country = numMap.get(needNum);
				int rank[] = {1,1,1,1};
				for (int j = 0; j < n; j++) {
					Double []newCou = counList.get(j);
					if (!needNumList.contains((int)(double)newCou[0])) {
						continue;
					}
					if ((double)newCou[0] == (double)needNum) {
						continue;
					}
					if (country[1] < newCou[1]) {
						rank[0]++;
					}
					if (country[2] < newCou[2]) {
						rank[1]++;
					}
					if (country[3] < newCou[3]) {
						rank[2]++;
					}
					if (country[4] < newCou[4]) {
						rank[3]++;
					}
				}
				int high = n+1;
				int seq = 0;
				for (int j = 0; j < 4; j++) {
					if (rank[j] < high) {
						high = rank[j];
						seq = j;
					}
				}
				System.out.println(high+":"+(seq+1));
			}
        	System.out.println();
        }
    }}
/**************************************************************
 Problem: 1007
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14616 kb
 ****************************************************************/




