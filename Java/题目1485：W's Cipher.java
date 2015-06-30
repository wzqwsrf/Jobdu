
// 题目1485：W's Cipher

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1485
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17614527
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
     * 1485
     */
public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int k1 = scanner.nextInt();
			int k2 = scanner.nextInt();
			int k3 = scanner.nextInt();
			if (k1 == 0 && k2 == 0 && k3 == 0) {
				break;
			}
			String a = scanner.next();
			char []array = a.toCharArray();
			int len = array.length;
			char []resArr = new char[len];
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			List<Integer> list3 = new ArrayList<Integer>();
			for (int i = 0; i < len; i++) {
				if (array[i] >= 'a' && array[i] <= 'i') {
					list1.add(i);
				}else if (array[i] >= 'j' && array[i] <= 'r') {
					list2.add(i);
				}else if ((array[i] >= 's' && array[i] <= 'z' )|| array[i] == '_'){
					list3.add(i);
				}
			}
			int size1 = list1.size();
			int size2 = list2.size();
			int size3 = list3.size();
			for (int i = 0; i < size1; i++) {
				int curPos = list1.get(i);
				int nextPos = (i + k1) % size1;
				resArr[list1.get(nextPos)] = array[curPos]; 
			}
			
			for (int i = 0; i < size2; i++) {
				int curPos = list2.get(i);
				int nextPos = (i + k2) % size2;
				resArr[list2.get(nextPos)] = array[curPos]; 
			}
			
			for (int i = 0; i < size3; i++) {
				int curPos = list3.get(i);
				int nextPos = (i + k3) % size3;
				resArr[list3.get(nextPos)] = array[curPos]; 
			}
			
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < len; i++) {
				sb.append(resArr[i]);
			}
			System.out.println(sb);
		}
	}}
/**************************************************************
 Problem: 1485
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:17660 kb
 ****************************************************************/




