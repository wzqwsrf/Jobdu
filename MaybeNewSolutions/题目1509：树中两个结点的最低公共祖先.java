
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;
  
public class Main {
    /*
     * 1509
     */
    private static int[] inputArr;
    private static int k ;
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            while (n > 0) {
                n --;
                String input = scanner.nextLine();
                String inputMsg[] = input.split(Pattern.quote(" "));
                int len = inputMsg.length;
                inputArr = new int[len];
                List<Integer> numList = new ArrayList<Integer>();
                for (int i = 0; i < len; i++) {
                    int tempNum = Integer.parseInt(inputMsg[i]);
                    numList.add(tempNum);
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
                if (!numList.contains(m1)) {
                    System.out.println("My God");
                    continue;
                }
                if (!numList.contains(m2)) {
                    System.out.println("My God");
                    continue;
                }
                k = 0;
                BinaSortTree biTree = createTree();
                List<Integer> charList1 = new ArrayList<Integer>();
                List<Integer> charList2 = new ArrayList<Integer>();
                getPath(biTree , m1 ,charList1);
                getPath(biTree , m2 ,charList2);
                charList1.add(m1);
                charList2.add(m2);
                getCommonList(charList1 ,charList2);
        }
    }
   
    private static void getCommonList(List<Integer> charList1,
            List<Integer> charList2) {
        int result = 0;
        int rank = 0;
        int size1 = charList1.size();
        int size2 = charList2.size();
        int size = Math.min(size1, size2);
        while (rank < size) {
            int value1 = charList1.get(rank);
            int value2 = charList2.get(rank);
            if (value1 == value2) {
                result = value1;
            }
            rank++;
        }
        System.out.println(result);
    }
  
    private static void getPath(BinaSortTree biTree, int m, List<Integer> charList  ) {
        Stack<Integer> stack = new Stack<Integer>();
        getActualPath(biTree ,stack , m ,charList);
    }
      
    private static void getActualPath(BinaSortTree biTree,
            Stack<Integer> stack, int m, List<Integer> charList) {
        if (biTree != null) {
            if (biTree.getValue() == m) {
                for (int actualm : stack) {
                    charList.add(actualm);
                }
                return;
            }
            stack.push(biTree.getValue());
            getActualPath(biTree.getLchild(), stack, m, charList );
            getActualPath(biTree.getRchild(), stack, m, charList );
            stack.pop();
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
        private int value ;
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
        public BinaSortTree(int value) {
            this.value = value;
        }
    }
}
/**************************************************************
	Problem: 1509
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:2830 ms
	Memory:70868 kb
****************************************************************/


                        