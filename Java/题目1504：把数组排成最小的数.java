
// 题目1504：把数组排成最小的数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1504
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/25896905
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /*
     * 2014年5月15日14:26:30
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Integer array[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            StrSort strSort = new StrSort();
            Arrays.sort(array, strSort);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(array[i]);
            }
            System.out.println(sb);
        }
    }
}

class StrSort implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        String numStr1 = o1 + "" + o2;
        String numStr2 = o2 + "" + o1;
        return numStr1.compareTo(numStr2);
    }
}
/**************************************************************
 * Problem: 1504
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:1960 ms
 * Memory:149288 kb
 ****************************************************************/


                        


