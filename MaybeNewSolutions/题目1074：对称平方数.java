
/** 
 * @ClassName: Main1046 
 * @Description: TODO 
 * @author wangzq
 * @date 2013-8-7 下午04:00:39 
 * 
 * @version 3.0.0 
 */
public class Main {
	public static void main(String[] args) {
		int num = 256;
		for (int i = 0; i < num; i++) {
			int square = i*i;
			boolean flag = checkPalindromeNum(square);
			if (flag) {
				System.out.print(i+"\n");
			}
		}
	}

	/**
	 * @Description: TODO
	 *
	 * @date 2013-8-10,下午12:39:30
	 * @author wangzq
	 * @version 3.0.0
	 *
	 * @param square
	 * @return
	 */
	private static boolean checkPalindromeNum(int square) {
		int aim = 0;
		int tempSquare = square;
		while (square!=0) {
			aim = aim*10+square%10;
			square = square/10;
		}
		if (aim == tempSquare) {
			return true;
		}
		return false;
	}
}

/**************************************************************
	Problem: 1074
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14516 kb
****************************************************************/


                        