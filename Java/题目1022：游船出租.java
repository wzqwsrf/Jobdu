
// 题目1022：游船出租

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1022
 */

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    /*
     * 1022
     */
public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		int idNum = scanner.nextInt();
		while (scanner.hasNext()) {
			Map<Integer, Map<String, Long>> storeMap = new HashMap<Integer, Map<String,Long>>();
			while (idNum != 0) {
				String sore = scanner.next();
				String time = scanner.next();
				Map<String, Long> secMap = storeMap.get(idNum);
				if (secMap == null) {
					secMap = new HashMap<String, Long>();
				}
				secMap.put(sore, sdf.parse(time).getTime());
				storeMap.put(idNum, secMap);
				idNum = scanner.nextInt();
			}
			if (idNum == 0) {
				scanner.next();
				scanner.next();
				idNum = scanner.nextInt();
			}
			int count = 0;
			int time = 0 ;
			for(Entry<Integer, Map<String, Long>> entry : storeMap.entrySet()){
				Map<String, Long> secMap = entry.getValue();
				if (secMap.keySet().size() != 2) {
					continue;
				}
				count++;
				time += Math.abs(secMap.get("E") - secMap.get("S") );
			}
			if (count == 0) {
				System.out.println(0+" "+ 0);
			}else {
				double tempTime = time/1000;
				System.out.println(count+" "+ Math.round((tempTime/count)));
			}
			if (idNum == -1) {
				break;
			}
		}
		
	}
}
/**************************************************************
 Problem: 1022
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:120 ms
 Memory:17824 kb
 ****************************************************************/




