
// 题目1363：欢乐斗地主

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1363
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
     * 1363
     */
public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int calArr[] = new int[16];
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
				array[i] = scanner.nextInt();
				if (array[i] == 1 || array[i] == 2) {
					array[i] += 13;
				}
				calArr[array[i]]++;
			}
            int num1 = scanner.nextInt();
            if (num1 == 1 || num1 == 2) {
				num1 += 13;
			}
            scanner.next();
            scanner.next();
            scanner.next();
            scanner.next();
            List<Integer> threeList = new ArrayList<Integer>();
            List<Integer> twoList = new ArrayList<Integer>();
            for (int i = 1; i < calArr.length; i++) {
				if (calArr[i] == 2) {
					twoList.add(i);
				}
				if (calArr[i] >= 3) {
					threeList.add(i);
				}
			}
//          都为空，放弃
			if ((threeList.isEmpty() && twoList.isEmpty())) {
				System.out.println("My God");
			} else if (threeList.isEmpty() && !twoList.isEmpty()) {
				System.out.println("My God");
			} else if (!threeList.isEmpty() && twoList.isEmpty()) {
				if (threeList.size() == 1) {
					System.out.println("My God");
				} else {
					Collections.sort(threeList);
					int res = 0;
					int starti = 0;
					for (int i = 0; i < threeList.size(); i++) {
						int tempNum = threeList.get(i);
						if (tempNum > num1) {
							res = tempNum;
							starti = i;
							break;
						}
					}
					if (res == 0) {
						System.out.println("My God");
					} else {
						int num2 = 0;
						if (starti > 0) {
							num2 = threeList.get(0);
						} else {
							num2 = threeList.get(1);
						}

						if (res > 13) {
							res -= 13;
						}
						if (num2 > 13) {
							num2 -= 13;
						}
						String sb = res + " " + res + " " + res + " " + num2
								+ " " + num2;
						System.out.println(sb);
					}
				}
			} else if (!threeList.isEmpty() && !twoList.isEmpty()) {
				Collections.sort(threeList);
				int res = 0;
				int starti = 0;
				for (int i = 0; i < threeList.size(); i++) {
					int tempNum = threeList.get(i);
					if (tempNum > num1) {
						res = tempNum;
						starti = i;
						break;
					}
				}
				if (res == 0) {
					System.out.println("My God");
				} else {
					threeList.remove(starti);
					twoList.addAll(threeList);
					Collections.sort(twoList);
					int num2 = twoList.get(0);
					if (res > 13) {
						res -= 13;
					}
					if (num2 > 13) {
						num2 -= 13;
					}
					String sb = res + " " + res + " " + res + " " + num2 + " "
							+ num2;
					System.out.println(sb);
				}
			}
		}
	}
}
/**************************************************************
 Problem: 1363
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:2280 ms
 Memory:38760 kb
 ****************************************************************/




