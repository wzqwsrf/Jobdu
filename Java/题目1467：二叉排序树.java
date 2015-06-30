
// 题目1467：二叉排序树

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1467
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1467
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            BinaSortTree biTree = null;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int head = (int) st.nval;
                biTree = createTree(biTree, head);
            }
        }
    }

    private static BinaSortTree createTree(BinaSortTree biTree, int head) {
        BinaSortTree node = new BinaSortTree(null, null, head);
        if (biTree == null) {
            biTree = node;
            System.out.println(-1);
        } else {
            BinaSortTree point = biTree;
            while (point != null) {
                if (head > point.getValue()) {
                    if (point.getRchild() == null) {
                        System.out.println(point.getValue());
                        point.setRchild(node);
                        break;
                    } else {
                        point = point.getRchild();
                    }
                } else {
                    if (point.getLchild() == null) {
                        System.out.println(point.getValue());
                        point.setLchild(node);
                        break;
                    } else {
                        point = point.getLchild();
                    }
                }
            }
        }
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

        public BinaSortTree(BinaSortTree lchild, BinaSortTree rchild, int value) {
            super();
            this.lchild = lchild;
            this.rchild = rchild;
            this.value = value;
        }
    }
}

/**************************************************************
 Problem: 1467
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:100 ms
 Memory:15008 kb
 ****************************************************************/




