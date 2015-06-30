
// 题目1200：最大的两个数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1200
 */

import java.util.Scanner;

public class Main {
    /*
     * 1214
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int array[][] = new int[4][5];
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 5; k++) {
                        array[j][k] = scanner.nextInt();
                    }
                }
                int tempArray[][] = new int[2][5];
                for (int j = 0; j < 5; j++) {
                    int max = array[0][j];
                    int firmaxId = 0;

                    for (int k = 0; k < 4; k++) {
                        if (array[k][j] > max) {
                            max = array[k][j];
                            firmaxId = k;
                        }
                    }
                    int tempMax = array[0][j];
                    int secMaxId = 0;
                    for (int k = 0; k < 4; k++) {
                        if (k != firmaxId) {
                            tempMax = array[k][j];
                            secMaxId = k;
                            break;
                        }
                    }
                    for (int k = 0; k < 4; k++) {
                        if (array[k][j] > tempMax && k != firmaxId) {
                            tempMax = array[k][j];
                            secMaxId = k;
                        }
                    }
                    int minId = Math.min(firmaxId, secMaxId);
                    int maxId = Math.max(firmaxId, secMaxId);
                    tempArray[0][j] = array[minId][j];
                    tempArray[1][j] = array[maxId][j];
                }

                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 5; k++) {
                        sb.append(tempArray[j][k] + " ");
                    }
                    sb.append("\n");
                }
                System.out.print(sb.toString());
            }
        }
    }
}
/**************************************************************
 Problem: 1200
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:600 ms
 Memory:45972 kb
 ****************************************************************/




