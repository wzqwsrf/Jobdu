
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main{
    /*
     * 1052
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                    new InputStreamReader(System.in)));
        while(st.nextToken() != StreamTokenizer.TT_EOF){
		    int n = (int)st.nval;
            int array[] = new int[n];
            for(int i = 0; i < n; i++){
                st.nextToken();
                array[i] = (int)st.nval;
            }
            st.nextToken();
            int x = (int)st.nval;
            System.out.println(findPos(array, x));
	    }
    }
    private static int findPos(int array[], int x){
        int len = array.length;
        for(int i = 0; i < len; i++){
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    }
}

/**************************************************************
	Problem: 1052
	User: wangzhenqing
	Language: Java
	Result: Accepted
	Time:70 ms
	Memory:14572 kb
****************************************************************/


                        