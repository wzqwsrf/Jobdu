
// 题目1508：把字符串转换成整数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1508
 */

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
    /*
     * 1206
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            char[] array = a.toCharArray();
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                char c = array[i];
                if (c != '+' && c != '-' && (c < '0' || c > '9')) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                System.out.println("My God");
            } else {
                //					List<Character> arrList = new ArrayList<Character>();
                //		            int k = 0;
                //		            while (k < array.length-1) {
                //						if (array[0]=='+') {
                //							k++;
                //							if (array[k]=='0'&&array[k+1]!='0') {
                //								arrList.add(array[k+1]);
                //							}
                //							k++;
                //						}else if (array[0]=='-'){
                //							arrList.add(array[0]);
                //							k++;
                //							if (array[k]=='0'&&array[k+1]!='0') {
                //								arrList.add(array[k+1]);
                //							}
                //							k++;
                //						}else {
                //							if (array[k]=='0'&&array[k+1]!='0') {
                //								arrList.add(array[k+1]);
                //							}
                //							k++;
                //						}

                if (array[0] == '+') {
                    for (int i = 1; i < array.length; i++) {
                        System.out.print(array[i]);
                    }
                } else {
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i]);
                    }
                }
                System.out.println();
            }

        }
    }
}
/**************************************************************
 Problem: 1508
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:770 ms
 Memory:19344 kb
 ****************************************************************/




