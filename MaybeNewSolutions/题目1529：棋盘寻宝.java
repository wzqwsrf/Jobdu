
import java.util.Scanner;

public class Main {
	/*
     * 1529 棋盘寻宝
     */
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int array[][] = new int[8][8];
			int dp[][] = new int[8][8];
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					array[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (i == 0 && j == 0) {
						dp[i][j] = array[i][j]; 
					}else if (i == 0) {
						dp[i][j] = dp[i][j-1] + array[i][j];
					}else if (j == 0) {
						dp[i][j] = dp[i-1][j] + array[i][j];
					}else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+array[i][j];
					}
				}
			}
			System.out.println(dp[7][7]);
        }
    }
}
/**************************************************************
	Problem: 1529
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:620 ms
	Memory:19176 kb
****************************************************************/


                        