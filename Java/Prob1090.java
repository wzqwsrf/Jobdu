
// 题目1090：路径打印

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年05月11日17:50:40
 * @url:http://ac.jobdu.com/problem.php?pid=1090
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Prob1090 {
    /*
     * 1090
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<String> arrList = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String tempStr = scanner.next();
                String tempArr[] = tempStr.split(Pattern.quote("\\"));
                String fir = tempArr[0];
                if (!arrList.contains(fir)) {
                    arrList.add(fir);
                }
                for (int j = 1; j < tempArr.length; j++) {
                    fir += "\\" + tempArr[j];
                    if (!arrList.contains(fir)) {
                        arrList.add(fir);
                    }
                }
            }
            int size = arrList.size();
            String array[] = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = arrList.get(i);
            }
            Arrays.sort(array);
            StringBuffer sb = new StringBuffer();
            List<String> couList = new ArrayList<String>();
            for (int i = 0; i < size; i++) {
                String tempStr = array[i];
                String tempArr[] = tempStr.split(Pattern.quote("\\"));
                for (int j = 0; j < tempArr.length; j++) {
                    int count = 0;
                    int k = j;
                    while (j != 0 && k >= 1) {
                        int strLen = tempArr[k - 1].length();
                        count += strLen;
                        k--;
                    }
                    count += j;
                    String str = "";
                    k = 0;
                    while (j != 0 && k < count) {
                        str += " ";
                        k++;
                    }
                    str += tempArr[j];
                    if (!couList.contains(str)) {
                        couList.add(str);
                        sb.append(str + "\n");
                    }
                }
            }
            System.out.println(sb);
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1090
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:90 ms
 * Memory:15796 kb
 * **************************************************************
 */