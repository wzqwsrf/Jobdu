
// 题目1459：Prime ring problem

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1459
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/35784483
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
     * 1040 2014年6月29日12:07:05
     */
    private static int len;
    private static List<Integer> primeList;

    public static void main(String[] args) throws Exception {
        len = 60;
        initPrimeList();
        int seq = 1;
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            System.out.println("Case " + seq + ":");
            int visit[] = new int[n + 1];
            int array[] = new int[n + 1];
            array[1] = 1;
            dfs(array, visit, 2, n);
            System.out.println();
            seq++;
        }
    }

    private static void dfs(int[] array, int[] visit, int start, int n) {
        if (start == n + 1) {
            StringBuffer sb = new StringBuffer();
            if (primeList.contains(1 + array[n])) {
                for (int i = 1; i < n; i++) {
                    sb.append(array[i] + " ");
                }
                sb.append(array[n]);
                System.out.println(sb);
            }
            return;
        }
        for (int i = 2; i < n + 1; i++) {
            if (visit[i] == 0 && primeList.contains(i + array[start - 1])) {
                visit[i] = 1;
                array[start] = i;
                dfs(array, visit, start + 1, n);
                visit[i] = 0;
            }
        }
    }

    private static void initPrimeList() {
        int array[] = new int[len];
        for (int i = 1; i < len; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        array[1] = 0;
        array[2] = 1;
        for (int i = 3; i < len; i++) {
            if (array[i] == 1) {
                for (int j = 2 * i; j < len; j += i) {
                    array[j] = 0;
                }
            }
        }
        primeList = new ArrayList<Integer>();
        for (int i = 1; i < len; i++) {
            if (array[i] == 1) {
                primeList.add(i);
            }
        }
    }
}

/**************************************************************
 * Problem: 1459
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1590 ms
 * Memory:105052 kb
 ****************************************************************/


                        


