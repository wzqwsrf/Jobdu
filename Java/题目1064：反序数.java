
// 题目1064：反序数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1064
 */

/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
    /*
     * 1064
     */
    public static void main(String[] args) {
        for (int i = 1000; i < 1112; i++) {
            int ordinalNum = getOrdinalNum(i);
            int num = i * 9;
            if (num == ordinalNum) {
                System.out.println(i);
            }
        }
    }

    /**
     * @Description: TODO
     *
     * @date 2013-8-12,上午11:14:38
     * @author wangzq
     * @version 3.0.0
     *
     * @param i
     * @return
     */
    private static int getOrdinalNum(int num) {
        String numStr = num + "";
        char[] array = numStr.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + "";
        }
        return Integer.parseInt(result);
    }
}
/**************************************************************
 Problem: 1064
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14612 kb
 ****************************************************************/




