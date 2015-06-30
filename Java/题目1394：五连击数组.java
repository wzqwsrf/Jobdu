
// 题目1394：五连击数组

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1394
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19168705
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
     * 1394
     */
public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n < 0) {
                break;
            }
            List<Integer> arrList = new ArrayList<Integer>();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                arrList.add(array[i]);
            }
             
            Arrays.sort(array);
            int min = 5;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 1; j < 5; j++) {
                    if (arrList.contains(array[i]+j)) {
                        continue;
                    }else {
                        count++;
                    }
                }
                min = Math.min(min, count);
                if(min == 0){
                    break;
                }
            }
            System.out.println(min);
        }
    }}
/**************************************************************
 Problem: 1394
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:80 ms
 Memory:16224 kb
 ****************************************************************/




