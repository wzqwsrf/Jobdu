
// 题目1475：IP数据包解析

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1475
 */

import java.util.Scanner;

public class Main {
    /*
     * 1475
     */
    private static char[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i < n + 1; i++) {
                String data = scanner.nextLine().replace(" ", "");
                array = data.toCharArray();
                //这里应该是第16位到31位，4个数，也就是输入数据的第4位到第7位
                int len = getAllLen(4, 4);
                int IHL = getNum(array[1]);
                System.out
                        .printf("Case #%d\nTotal length = %d bytes\n", i, len); //输出总长度   
                System.out.printf("Source = %d.%d.%d.%d\n", getAllLen(24, 2),
                        getAllLen(26, 2), getAllLen(28, 2), getAllLen(30, 2));
                System.out.printf("Destination = %d.%d.%d.%d\n", getAllLen(32,
                        2), getAllLen(34, 2), getAllLen(36, 2),
                        getAllLen(38, 2));
                System.out.printf("Source Port = %d\n", getAllLen(IHL * 8, 4));
                System.out.printf("Destination Port = %d\n\n", getAllLen(
                        IHL * 8 + 4, 4));
            }
        }
    }

    private static int getAllLen(int start, int len) {
        int allLen = 0;
        int factor = 1;
        for (int i = start + len - 1; i >= start; i--) {
            allLen += getNum(array[i]) * factor;
            factor *= 16;
        }
        return allLen;
    }

    private static int getNum(char c) {
        int num = 0;
        if (c >= '0' && c <= '9') {
            num = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            num = c - 'a' + 10;
        }
        return num;
    }
}
/**************************************************************
 Problem: 1475
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:140 ms
 Memory:18512 kb
 ****************************************************************/




