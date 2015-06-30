
// 题目1165：字符串匹配

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1165
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			String []array = new String[n];
			for (int i = 0; i < n; i++) {
				array[i] = scanner.next();
			}
			Map<String, String> tempMap = new HashMap<String, String>();
			String desStr = scanner.next();
			int leftBra = desStr.indexOf('[');
			int rightBra = desStr.indexOf(']');
			String a = desStr.substring(0,leftBra);
			String b = desStr.substring(leftBra+1,rightBra);
			String c = desStr.substring(rightBra+1, desStr.length());
			for (int i = 0; i < b.length(); i++) {
				String key = (a+String.valueOf(b.charAt(i))+c).toLowerCase();
				tempMap.put(key, key);
			}
			
			for (int i = 0; i < array.length; i++) {
				if (tempMap.get(array[i].toLowerCase()) != null) {
					System.out.println((i+1)+" "+array[i]);
				}
			}
		}
	}}

/**************************************************************
 Problem: 1165
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:15448 kb
 ****************************************************************/




