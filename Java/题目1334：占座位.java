
// 题目1334：占座位

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1334
 */

import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
     * 1334
     */
public static void main(String[] args) throws Exception {
		Map<Integer, Integer[]> allMap = new HashMap<Integer, Integer[]>();
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	st.nextToken();
        	int m = (int) st.nval;
        	st.nextToken();
        	int k = (int) st.nval;
        	int size = n*n+1;
        	int seatArr[] = new int[size];
        	int peopleArr[] = new int[m+1];
        	for (int i = 0; i < k; i++) {
				st.nextToken();
				String order = st.sval;
				if (order.equals("in")) {
					st.nextToken();
		        	int id = (int) st.nval;
		        	st.nextToken();
		        	int num = (int) st.nval;
					if (peopleArr[id] == 1) {
						System.out.println("no");
					}else {
						int left = 0;
						int right = 0;
						boolean allFlag = true;
						for (int indexi = 1; indexi < size; indexi++) {
							boolean flag = true;
							for (int indexj = indexi; indexj <(indexi + num) ; indexj++) {
								if (indexj >= size) {
									flag = false;
									break;
								}
								if (seatArr[indexj] == 1) {
									flag = false;
									break;
								}
							}
							if (flag) {
								allFlag = true;
								left = indexi;
								right = indexi + num - 1;
//								System.out.println(left+" "+right);
								break;
							}else {
								allFlag = false;
							}
						}
						if (allFlag) {
							int tempLeft = left;
							for (; tempLeft <= right; tempLeft++) {
								seatArr[tempLeft] = 1;
							}
//							System.out.println(left+" "+right);
							Integer[] array = {left , right}; 
							allMap.put(id, array);
							peopleArr[id] = 1;
							System.out.println("yes");
						}else {
							System.out.println("no");
						}
						
					}
				}else if (order.equals("out")) {
					st.nextToken();
		        	int id = (int) st.nval;
		        	if (peopleArr[id] == 0) {
					}else {
						Integer[] array = allMap.get(id);
						for (int j = array[0]; j <= array[1]; j++) {
							seatArr[j] = 0;
							peopleArr[id] = 0;
						}
					}
				}
			}
        }
    }
}
/**************************************************************
 Problem: 1334
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1100 ms
 Memory:22080 kb
 ****************************************************************/




