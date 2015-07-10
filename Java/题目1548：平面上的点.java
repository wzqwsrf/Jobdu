
// 题目1548：平面上的点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1548
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19914971
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
     * 1548
     */
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                System.out.println(n);
                continue;
            }
            Node nodes[] = new Node[n];
            Map<String, Integer> numMap = new HashMap<String, Integer>();
            int k = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int x = (int) st.nval;
                st.nextToken();
                int y = (int) st.nval;
                String xy = x + "_" + y;
                int num = 1;
                if (numMap.containsKey(xy)) {
                    num += numMap.get(xy);
                } else {
                    nodes[k] = new Node(x, y);
                    k++;
                }
                numMap.put(xy, num);
            }
            if (n == 1 || n == 2) {
                System.out.println(n);
                continue;
            }
            n = k;
            int maxNum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tempNum = 0;
                    tempNum += numMap.get(nodes[i].x + "_" + nodes[i].y)
                            + numMap.get(nodes[j].x + "_" + nodes[j].y);
                    for (k = j + 1; k < n; k++) {
                        int num1 = (nodes[k].y - nodes[i].y) * (nodes[j].x - nodes[i].x);
                        int num2 = (nodes[j].y - nodes[i].y) * (nodes[k].x - nodes[i].x);
                        if (num1 == num2) {
                            tempNum += numMap.get(nodes[k].x + "_" + nodes[k].y);
                        }
                    }
                    maxNum = Math.max(tempNum, maxNum);
                }
            }
            for (int value : numMap.values()) {
                maxNum = Math.max(value, maxNum);
            }
            System.out.println(maxNum);
        }
    }

    public static class Node {
        int x;

        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

/**************************************************************
 Problem: 1548
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:820 ms
 Memory:35804 kb
 ****************************************************************/




