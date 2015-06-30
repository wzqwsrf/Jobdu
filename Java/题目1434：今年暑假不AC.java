
// 题目1434：今年暑假不AC

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1434
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1434
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            TVprogram tvs[] = new TVprogram[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int start = (int) st.nval;
                st.nextToken();
                int end = (int) st.nval;
                tvs[i] = new TVprogram(start, end);
            }
            Arrays.sort(tvs);
            int count = 0;
            int lastEnd = -1;
            for (int i = 0; i < n; i++) {
                if (tvs[i].getStart() >= lastEnd) {
                    lastEnd = tvs[i].getEnd();
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static class TVprogram implements Comparable<TVprogram> {

        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public TVprogram(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }

        public int compareTo(TVprogram o) {
            return this.getEnd() - o.getEnd();
        }

    }
}

/**************************************************************
 * Problem: 1434
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:70 ms
 * Memory:14792 kb
 ****************************************************************/


                        


