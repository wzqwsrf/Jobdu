
import java.math.BigInteger;
import java.util.Scanner;
/**
 * @ClassName: Main1046
 * @Description: TODO
 * @author wangzq
 * @date 2013-8-7 下午04:00:39
 * 
 * @version 3.0.0
 */
public class Main {
	/*
	 * 1194
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            System.out.println(new BigInteger(N+"").toString(8));
        }
    }
}

/**************************************************************
	Problem: 1194
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:900 ms
	Memory:46424 kb
****************************************************************/


                        