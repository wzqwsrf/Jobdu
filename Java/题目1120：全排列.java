
// 题目1120：全排列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1120
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18735245
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<String> arrList;

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            arrList = new ArrayList<String>();
            String a = st.sval;
            char array[] = a.toCharArray();
            Arrays.sort(array);
            permutation(array);
            Collections.sort(arrList);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arrList.size(); i++) {
                sb.append(arrList.get(i) + "\n");
            }
            System.out.println(sb);
        }
    }

    private static void permutation(char[] array) {
        // TODO Auto-generated method stub
        int len = array.length;
        while (true) {
            arrList.add(String.valueOf(array));
            int first = getFirst(array, len);
            if (first == -1) {
                return;
            }
            int i = len - 1;
            for (; i > first; i--) {
                if (array[i] > array[first]) {
                    break;
                }
            }
            swap(array, first, i);
            reverse(array, first + 1, len - 1);
        }
    }

    private static int getFirst(char[] array, int len) {
        for (int i = len - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    private static void swap(char[] array, int a, int b) {
        char temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    private static void reverse(char[] array, int a, int b) {
        while (a < b) {
            swap(array, a, b);
            a++;
            b--;
        }
    }
}
/**************************************************************
 * Problem: 1120
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:1700 ms
 * Memory:178508 kb
 ****************************************************************/


                        


