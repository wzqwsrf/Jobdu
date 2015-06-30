
// 题目1326：Waiting in Line

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1326
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17475331
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
     * 1326
     */
public static void main(String[] args) throws Exception {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int)st.nval;
			st.nextToken();
			int m = (int)st.nval;
			st.nextToken();
			int k = (int)st.nval;
			st.nextToken();
			int q = (int)st.nval;
			int tArray[] = new int[k+1];
			for (int i = 1; i < k+1; i++) {
				st.nextToken();
				tArray[i] = (int)st.nval;
			}
			Map<Integer, Customer> resultMap = new HashMap<Integer, Customer>();
			List<Customer> allList[] = new ArrayList[n];
			int array[] = new int[n];
			int count = 0;
			int newM = m;
			boolean flag = true;
			while (newM > 0) {
				newM--;
				for (int i = 0; i < n; i++) {
					count++;
					if (count > k ) {
						flag = false;
						break;
					}
					if (allList[i] == null) {
						allList[i] = new ArrayList<Customer>();
					}
					int size = allList[i].size();
					int allTime = 0;
					if (size != 0) {
						allTime = allList[i].get(size-1).allTime; 
					}
					Customer cu = new Customer(i, tArray[count], allTime+tArray[count]);
					allList[i].add(cu);
					resultMap.put(count, cu);
				}
				if (!flag) {
					break;
				}
			}
			while (count < k) {
				count++;
				Customer minCus = allList[0].get(array[0]);
				int min = minCus.allTime;
				int groupId = minCus.groupId;
				for (int i = 1; i < n; i++) {
					Customer tempCus = allList[i].get(array[i]);
					if (tempCus.allTime < min) {
						min = tempCus.allTime;
						groupId = tempCus.groupId;
					}
				}
				int	tempAllTime = allList[groupId].get(allList[groupId].size()-1).allTime;
				array[groupId]++;
				Customer finalCustomer = new Customer(groupId,tArray[count], tempAllTime+tArray[count]);
				allList[groupId].add(finalCustomer);
				resultMap.put(count, finalCustomer);
			}
//			for (int i = 0; i < array.length; i++) {
//				System.out.println(array[i]);
//			}
			for (int i = 0; i < q; i++) {
				st.nextToken();
				int rank = (int)st.nval;
				Customer finalCustomer = resultMap.get(rank);
				if (finalCustomer == null) {
					System.out.println("Sorry");
				}else {
					int minutes = finalCustomer.allTime;
					if (minutes > 540) {
						System.out.println("Sorry");
						continue;
					}
					int hour = minutes/60;
					int newMi = minutes%60;
					System.out.println(((hour+8) < 10 ? "0"+(hour+8) : (hour+8))+":"+ (newMi < 10 ? "0"+newMi : newMi));
				}
			}
		}
	}
    private static class Customer {
        private int groupId;

        private int taskTime;

        private int allTime;

        public Customer(int groupId, int taskTime, int allTime) {
            super();
            this.groupId = groupId;
            this.taskTime = taskTime;
            this.allTime = allTime;
        }
    }
}
/**************************************************************
 Problem: 1326
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:510 ms
 Memory:20404 kb
 ****************************************************************/




