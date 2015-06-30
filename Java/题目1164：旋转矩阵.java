
// 题目1164：旋转矩阵

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1164
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18615581
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int N = scanner.nextInt();
			int arrayA[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int num = scanner.nextInt();
					arrayA[i][j] = num;
				}
			}
			int arrayB[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int num = scanner.nextInt();
					arrayB[i][j] = num;
				}
			}
			int firstNum = revolve0(arrayA,arrayB,N);
			int secNum =revolve90(arrayA,arrayB,N);
			int thiNum = revolve180(arrayA,arrayB,N);
			int fourNum = revolve270(arrayA,arrayB,N);
			if (firstNum == -1 && secNum == -1 && thiNum == -1 && fourNum == -1) {
				System.out.println(-1);
			}else {
				List<Integer> arrayList = new ArrayList<Integer>();
				if (firstNum != -1) {
					arrayList.add(firstNum);
				}
				if (secNum != -1) {
					arrayList.add(secNum);
				}
				if (thiNum != -1) {
					arrayList.add(thiNum);
				}
				if (fourNum != -1) {
					arrayList.add(fourNum);
				}
				
				Collections.sort(arrayList);
				System.out.println(arrayList.get(0));
			}
		}
	}
    private static int revolve0(int[][] arrayA, int[][] arrayB, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arrayB[i][j] == arrayA[i][j]) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return 0;
    }

    private static int revolve90(int[][] arrayA, int[][] arrayB, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arrayB[i][j] == arrayA[N - j - 1][i]) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return 90;
    }

    private static int revolve180(int[][] arrayA, int[][] arrayB, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arrayB[i][j] == arrayA[N - i - 1][N - j - 1]) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return 180;
    }

    private static int revolve270(int[][] arrayA, int[][] arrayB, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arrayB[i][j] == arrayA[j][N - i - 1]) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return 270;
    }
}
/**************************************************************
 Problem: 1164
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:110 ms
 Memory:18660 kb
 ****************************************************************/




