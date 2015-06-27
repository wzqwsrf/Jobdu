
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Main {
    /*
     * 1252
     */
	private static int queen[];
	private static List<Integer> arrList ;
//	private static int count ;
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	int allNum = (int) st.nval;
        	while (allNum > 0) {
        		st.nextToken() ;
        		int seq = (int) st.nval;
        		int n = 8;
//            	count = 0;
            	arrList = new ArrayList<Integer>();
            	queen = new int[ n + 1];
            	getQueen(n);
//            	Collections.sort(arrList);
//            	System.out.println(count);
            	System.out.println(arrList.get(seq-1));
				allNum -- ;
			}
        }
    }

	private static void getQueen( int n ) {
		
		int row = 1;
		int col = 1;
		while (row < n + 1) {
			while (col < n + 1) {
				if (valid(row, col)) {
					queen[row] = col;
					col = 1;
					break;
				}else {
					col ++;
				}
			}
			if (queen[row] == 0) {
				if (row == 1) {
					break;
				}else {
					row -- ;
					col = queen[row] + 1;
					queen[row] = 0;
					continue;
				}
			}
			if (row == n) {
				printf(n);
//				count ++;
				col = queen[row] + 1;
				queen[row] = 0;
				continue;
			}
			row ++;
		}
		
	}
	private static void printf(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < n+1; i++) {
			sb.append(queen[i]);
		}
		arrList.add(Integer.parseInt(sb.toString()));
	}

	private static boolean valid(int row, int col ) {
		
		for (int i = 0; i < row; i++) {
			if (queen[i] != 0 && (queen[i] == col || Math.abs(i - row) == Math.abs(queen[i] - col)))  
	            return false;  
		}
		return true;
	}
}
/**************************************************************
	Problem: 1140
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:250 ms
	Memory:21712 kb
****************************************************************/


                        