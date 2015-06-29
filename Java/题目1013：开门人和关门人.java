
import java.util.Scanner;
 
public class Main {
	/*
     * 1522
     */
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        	int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                int M = scanner.nextInt();
                String id = scanner.next();
                String firstStr = scanner.next();
                String secStr = scanner.next();
                String firstId = id;
                String lastId = id;
                for (int j = 1; j < M; j++) {
                    String newId = scanner.next();
                    String newFirstStr = scanner.next();
                    String newSecStr = scanner.next();
                    if (newFirstStr.compareTo(firstStr) < 0 ) {
                        firstId = newId;
                    }
                    if (newSecStr.compareTo(secStr) > 0) {
                        lastId = newId;
                    }
                }
                System.out.println(firstId+" "+lastId);
            }
        }
    }
}

/**************************************************************
	Problem: 1013
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:80 ms
	Memory:15464 kb
****************************************************************/


                        