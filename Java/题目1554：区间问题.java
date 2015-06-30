
// 题目1554：区间问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1554
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * 1554
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int array[] = new int[n + 1];
            int sumArr[] = new int[n + 1];
            Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
            for (int i = 1; i <= n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
                sumArr[i] = sumArr[i - 1] + array[i];
                if (!sumMap.containsKey(sumArr[i])) {
                    sumMap.put(sumArr[i], i);
                }
            }
            st.nextToken();
            int k = (int) st.nval;
            boolean flag = false;
            List<Node> nodeList = new ArrayList<Node>();
            int start = 0;
            int end = 0;
            for (int i = n; i > 0; i--) {
                if (sumArr[i] == k) {
                    flag = true;
                    start = 1;
                    end = i;
                    Node node = new Node(start, end);
                    nodeList.add(node);
                    continue;
                }
                if (i == 1 && sumArr[i] != k) {
                    continue;
                }
                int tempNum = sumArr[i] - k;
                if (sumMap.containsKey(tempNum)) {
                    int tempStart = sumMap.get(tempNum) + 1;
                    if (tempStart > i) {
                        continue;
                    }
                    flag = true;
                    start = sumMap.get(tempNum) + 1;
                    end = i;
                    Node node = new Node(start, end);
                    nodeList.add(node);
                }
            }
            if (!flag) {
                System.out.println("No");
                continue;
            }
            Collections.sort(nodeList);
            Node node = nodeList.get(0);
            System.out.println(node.start + " " + node.end);
        }
    }

    private static class Node implements Comparable<Node> {
        int start;
        int end;

        public Node(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }

        public int compareTo(Node o) {
            if (this.start == o.start) {
                return this.end - o.end;
            } else {
                return this.start - o.start;
            }
        }
    }
}

/**************************************************************
 * Problem: 1554
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:2810 ms
 * Memory:132680 kb
 ****************************************************************/


                        


