
// 题目1059：abc

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1059
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
     * 1059
     */
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    String abc = (i + "") + (j + "") + k;
                    String bcc = (j + "") + (k + "") + k;
                    if (Integer.parseInt(abc) + Integer.parseInt(bcc) == 532) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}

/**************************************************************
 Problem: 1059
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:70 ms
 Memory:14752 kb
 ****************************************************************/




