
// 题目1324：The Best Rank

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1324
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
     * 1324
     */
public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	st.nextToken();
        	int m = (int) st.nval;
        	Map<Integer, Integer[]> numMap = new HashMap<Integer, Integer[]>();
        	List<Integer[]> stuList = new ArrayList<Integer[]>();
        	for (int i = 0; i < n; i++) {
        		Integer[]student = new Integer[5];
				st.nextToken();
				student[0] = (int) st.nval;
				st.nextToken();
				student[2] = (int) st.nval;
				st.nextToken();
				student[3] = (int) st.nval;
				st.nextToken();
				student[4] = (int) st.nval;
				student[1] = student[2] + student[3] + student[4];
				numMap.put(student[0], student);
				stuList.add(student);
			}
        	
        	String course[] = {"A","C","M","E"};
        	for (int i = 0; i < m; i++) {
				st.nextToken();
				int needNum = (int)st.nval;
				if (!numMap.containsKey(needNum)) {
					System.out.println("N/A");
				}else {
					Integer []student = new Integer[5];
					student = numMap.get(needNum);
					int rank[] = {1,1,1,1};
					for (int j = 0; j < n; j++) {
						Integer []newStu = stuList.get(j);
						if (newStu[0] == needNum) {
							continue;
						}
						if (student[1] < newStu[1]) {
							rank[0]++;
						}
						if (student[2] < newStu[2]) {
							rank[1]++;
						}
						if (student[3] < newStu[3]) {
							rank[2]++;
						}
						if (student[4] < newStu[4]) {
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
					System.out.println(high+" "+course[seq]);
				}
			}
        }
    }}
/**************************************************************
 Problem: 1324
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:610 ms
 Memory:24956 kb
 ****************************************************************/




