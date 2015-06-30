
// 题目1355：扑克牌顺子

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1355
 */

import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * 1355
     */
public static void main(String[] args) throws Exception {
		Map<Integer, Integer[]> allMap = new HashMap<Integer, Integer[]>();
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int n = (int) st.nval;
        	if (n == 0) {
				break;
			}
        	int zeroNum = 0;
        	List<Integer> arrList = new ArrayList<Integer>();
        	for (int i = 0; i < n; i++) {
        		st.nextToken();
        		int num = (int) st.nval;
        		if (num != 0) {
					arrList.add(num);
				}else {
					zeroNum ++;
				}
			}
        	if (zeroNum == n) {
				System.out.println("So Lucky!");
				continue;
			}
        	
        	int size = arrList.size();
        	
        	int array[] = new int[size];
        	for (int i = 0; i < size; i++) {
				array[i] = arrList.get(i);
			}
        	Arrays.sort(array);
        	int lackNum = 0;
        	int k = 0;
        	int firNum = array[0]; 
        	while (k < n) {
				int tempNum = firNum + k;
				if (!arrList.contains(tempNum)) {
					lackNum ++;
				}
				k++;
			}
        	if (lackNum > zeroNum) {
				System.out.println("Oh My God!");
			}else {
				System.out.println("So Lucky!");
			}
        }
    }}
/**************************************************************
 Problem: 1355
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:360 ms
 Memory:14588 kb
 ****************************************************************/




