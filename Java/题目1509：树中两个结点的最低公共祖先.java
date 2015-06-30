
// 题目1509：树中两个结点的最低公共祖先

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1509
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17356751
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {
    /*
    * 1509
    */
    private static int[] inputArr;
    private static int k;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            n--;
            String input = scanner.nextLine();
            String inputMsg[] = input.split(Pattern.quote(" "));
            int len = inputMsg.length;
            inputArr = new int[len];
            for (int i = 0; i < len; i++) {
                int tempNum = Integer.parseInt(inputMsg[i]);
                inputArr[i] = tempNum;
            }

            String m1m2 = scanner.nextLine();
            String m2m2Msg[] = m1m2.split(Pattern.quote(" "));
            int m1 = Integer.parseInt(m2m2Msg[0]);
            int m2 = Integer.parseInt(m2m2Msg[1]);
            if (m1 == 0) {
                System.out.println("My God");
                continue;
            }
            if (m2 == 0) {
                System.out.println("My God");
                continue;
            }
            k = 0;
            BinaSortTree biTree = createTree();
            Stack<Integer> stack1 = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();
            if (getActualPath(biTree, stack1, m1) && getActualPath(biTree, stack2, m2)) {
                getCommonList(stack1, stack2);
            } else {
                System.out.println("My God");
            }
        }
    }

    private static void getCommonList(Stack<Integer> stack1,
                                      Stack<Integer> stack2) {
        int rank = 0;
        int size1 = stack1.size();
        int size2 = stack2.size();
        int arrayA[] = new int[size1];
        int arrayB[] = new int[size2];
        for (int i = size1 - 1; i >= 0; i--) {
            arrayA[i] = stack1.pop();
        }
        for (int i = size2 - 1; i >= 0; i--) {
            arrayB[i] = stack2.pop();
        }
        int size = Math.min(size1, size2);
        while (rank < size) {
            if (arrayA[rank] != arrayB[rank]) {
                break;
            }
            rank++;
        }
        System.out.println(arrayA[rank - 1]);
    }

    private static boolean getActualPath(BinaSortTree biTree,
                                         Stack<Integer> stack, int m) {
        if (biTree != null) {
            stack.push(biTree.getValue());
            if (biTree.getValue() == m) {
                return true;
            }
            if (getActualPath(biTree.getLchild(), stack, m)
                    || getActualPath(biTree.getRchild(), stack, m)) {
                return true;
            } else {
                stack.pop();
                return false;
            }
        } else {
            return false;
        }
    }

    private static BinaSortTree createTree() {
        int node = inputArr[k];
        k++;
        if (node == 0) {
            return null;
        }
        BinaSortTree biTree = new BinaSortTree(node);
        biTree.setLchild(createTree());
        biTree.setRchild(createTree());
        return biTree;
    }

    private static class BinaSortTree {
        private BinaSortTree lchild;
        private BinaSortTree rchild;
        private int value;

        public BinaSortTree getLchild() {
            return lchild;
        }

        public void setLchild(BinaSortTree lchild) {
            this.lchild = lchild;
        }

        public BinaSortTree getRchild() {
            return rchild;
        }

        public void setRchild(BinaSortTree rchild) {
            this.rchild = rchild;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaSortTree(int value) {
            this.value = value;
        }
    }
}
/**************************************************************
 * Problem: 1509
 * User: wangzhenqing
 * Language: Java
 * Result: Accepted
 * Time:2960 ms
 * Memory:76104 kb
 ****************************************************************/


                        


