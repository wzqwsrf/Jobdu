
// 题目1090：路径打印

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1090
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/24349977
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1090
     */
public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			List<String> arrList = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String tempStr = scanner.next();
				String tempArr[] = tempStr.split(Pattern.quote("\\"));
				String fir = tempArr[0];
				if (!arrList.contains(fir)) {
					arrList.add(fir);
				}
				for (int j = 1; j < tempArr.length; j++) {
					fir += "\\" + tempArr[j];
					if (!arrList.contains(fir)) {
						arrList.add(fir);
					}
				}
			}
			Collections.sort(arrList);
			int size = arrList.size();
			StringBuffer sb = new StringBuffer();
			List<String> couList = new ArrayList<String>();
			for (int i = 0; i < size; i++) {
				String tempStr = arrList.get(i);
				String tempArr[] = tempStr.split(Pattern.quote("\\"));
				int count = 0;
				for (int j = 0; j < tempArr.length; j++) {
					String str = "";
					if (j != 0) {
						count += tempArr[j-1].length();
						count += 1;
						int k = 0;
						while (k < count) {
							str += " ";
							k++;
						}
					}
					str += tempArr[j];
					if (!couList.contains(str)) {
						couList.add(str);
						sb.append(str + "\n");
					}
				}
			}
			System.out.println(sb);
		}
	}}

/**************************************************************
 Problem: 1090
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:15804 kb
 ****************************************************************/




