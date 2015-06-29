
import java.util.Scanner;

public class Main{
	/*
     * 1065
     */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int h = scanner.nextInt();
			StringBuffer sb = new StringBuffer();
			int allh = 3*h - 2;
			for (int i = 0; i < h; i++) {
				int symNum = h + i * 2;
				int blankNum = allh - symNum;
				while (blankNum > 0) {
					sb.append(" ");
					blankNum--;
				}
				while (symNum > 0) {
					sb.append("*");
					symNum --;
				}
				sb.append("\n");
			}
			System.out.print(sb);
        }
    }
}
/**************************************************************
	Problem: 1065
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:260 ms
	Memory:43208 kb
****************************************************************/


                        