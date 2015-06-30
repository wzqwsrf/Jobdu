

// 题目1482：玛雅人的密码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1482
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17416147
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
     * 1407
     */
    private static char array[];
    private static int n;
    private static Map<String, Integer> visitedMap;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            String input = scanner.next();
            if (n < 4) {
                System.out.println(-1);
                continue;
            }
            array = input.toCharArray();
            visitedMap = new HashMap<String, Integer>();
            System.out.println(bfs());
        }
    }

    private static int bfs() {
        Node node = new Node(array, 0);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node newNode = queue.poll();
            String newInput = String.valueOf(newNode.input);
            if (judgeIs2012(newNode.input)) {
                return newNode.step;
            }
            visitedMap.put(newInput, 1);
            for (int i = 0; i < n - 1; i++) {
                char tempArr[] = newInput.toCharArray();
                swapArr(tempArr, i, i + 1);
                String secInput = String.valueOf(tempArr);
                Integer num = visitedMap.get(secInput);
                if (num == null || num == 0) {
                    visitedMap.put(secInput, 1);
                    Node tmpNode = new Node(tempArr, newNode.step + 1);
                    queue.add(tmpNode);
                }
            }
        }
        return -1;
    }

    private static void swapArr(char[] input, int i, int j) {
        if (input[i] == input[i + 1]) {
            return;
        }
        char temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
    }

    private static boolean judgeIs2012(char[] input) {
        for (int i = 0; i < n - 3; i++) {
            if (input[i] == '2' && input[i + 1] == '0'
                    && input[i + 2] == '1' && input[i + 3] == '2') {
                return true;
            }
        }
        return false;
    }

    private static class Node {
        private char input[];
        private int step;

        public Node(char[] input, int step) {
            super();
            this.input = input;
            this.step = step;
        }
    }
}
/**************************************************************
 * Problem: 1482
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:270 ms
 * Memory:33284 kb
 ****************************************************************/


                        


