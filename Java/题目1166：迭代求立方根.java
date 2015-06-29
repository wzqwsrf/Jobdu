
import java.io.StreamTokenizer;

public class Main{
	/*
     * 1166
     */
    public static void main(String[] args) throws  Exception {
    	StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int x = (int) st.nval;
			st.nextToken();
        	int n = (int) st.nval;
        	double result = getCubeRoot(n , x);
        	System.out.printf("%.6f\n" , result);
        }
    }
    
	private static double getCubeRoot(int n, int x) {
		if (n == 0) {
			return x;
		}else {
			double result = getCubeRoot(n-1 , x);
			return  result*2/3 + x/(3*result*result);
		}
	}
}

/**************************************************************
	Problem: 1166
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14912 kb
****************************************************************/


                        