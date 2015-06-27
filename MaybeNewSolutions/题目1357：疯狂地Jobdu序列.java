
import java.io.StreamTokenizer;

public class Main {
	/*
     * 1357
     */
    public static void main(String[] args) throws Exception {
    	StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
        	long n = (long) st.nval;
        	double tempNum = (Math.sqrt(1+8*n)-1.0)/2;
        	long num = (long) Math.ceil(tempNum);
        	System.out.println(num);
        }
    }
}
/**************************************************************
	Problem: 1357
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:840 ms
	Memory:30616 kb
****************************************************************/


                        