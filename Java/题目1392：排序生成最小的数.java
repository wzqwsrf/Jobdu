
// 题目1392：排序生成最小的数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1392
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17229455
 */

import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /*
     * 1392
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Integer array[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            Arrays.sort(array, new MySort());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sb.append(array[i]);
            }
            System.out.println(sb.toString());
        }
    }

    static class MySort implements Comparator<Integer> {

        public int compare(Integer o1, Integer o2) {
            String ab = o1 + "" + o2;
            String ba = o2 + "" + o1;
            int res = ab.compareTo(ba);
            return res;
        }
    }
}

/**************************************************************
 * Problem: 1392
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:1900 ms
 * Memory:128020 kb
 ****************************************************************/


                        


