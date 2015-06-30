
// 题目1349：数字在排序数组中出现的次数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1349
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17226947
 */

import java.io.StreamTokenizer;

public class Main {
    /*
     * 1349
     * 这是一个已经排好序的序列。根据2分查找法，找到查询数字出现的开头和结尾。
     * 结尾-开头+1即为个数。
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            st.nextToken();
            int m = (int) st.nval;
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int queryNum = (int) st.nval;
                int result = getNumCount(array, queryNum);
                System.out.println(result);
            }
        }
    }

    private static int getNumCount(int[] array, int queryNum) {

        int begin = findNumBegin(array, queryNum);
        int end = findNumEnd(array, queryNum);
        if (begin > -1 && end > -1) {
            return (end - begin + 1);
        }
        return 0;
    }

    private static int findNumBegin(int[] array, int queryNum) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] < queryNum) {
                low = middle + 1;
            } else if (array[middle] == queryNum) {
                if (middle == 0 || array[middle - 1] != queryNum) {
                    return middle;
                } else {
                    high = middle - 1;
                }
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    private static int findNumEnd(int[] array, int queryNum) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;

            if (array[middle] < queryNum) {
                low = middle + 1;
            } else if (array[middle] == queryNum) {
                if (middle == high
                        || (middle < high && array[middle + 1] != queryNum)) {
                    return middle;
                } else {
                    low = middle + 1;
                }
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
/**************************************************************
 Problem: 1349
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1680 ms
 Memory:23852 kb
 ****************************************************************/




