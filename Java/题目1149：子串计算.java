
// 题目1149：子串计算

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1149
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    /*
     * 1149
     */
public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			int len = a.length();
			Map<String, Integer> numMap = new HashMap<String, Integer>();
			for (int i = 1; i < len; i++) {
				int tempLen = len - i + 1;
				for (int j = 0; j < tempLen; j++) {
					String subStr = a.substring(j, i+j);
					if (numMap.containsKey(subStr)) {
						int num = numMap.get(subStr);
						num += 1;
						numMap.put(subStr, num);
					}else {
						numMap.put(subStr, 1);
					}
				}
			}
			List<String> arrList = new ArrayList<String>();
			for(Entry<String, Integer> entry : numMap.entrySet()){
				String key = entry.getKey();
				int value = entry.getValue();
				if (value > 1) {
					arrList.add(key);
//					System.out.println(key+" "+value);
				}
			}
			Collections.sort(arrList);
			for (String subStr : arrList) {
				System.out.println(subStr+" "+numMap.get(subStr));
			}
		}
	}}
/**************************************************************
 Problem: 1149
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:160 ms
 Memory:19328 kb
 ****************************************************************/




