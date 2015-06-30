
// 题目1463：招聘会

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1463
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1463
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            JobFair jobFairs[] = new JobFair[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int start = (int) st.nval;
                st.nextToken();
                int end = (int) st.nval;
                jobFairs[i] = new JobFair(start, end);
            }
            Arrays.sort(jobFairs);
            int count = 0;
            int lastEnd = -1;
            for (int i = 0; i < n; i++) {
                if (jobFairs[i].getStart() >= lastEnd) {
                    lastEnd = jobFairs[i].getEnd();
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static class JobFair implements Comparable<JobFair> {

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

        public JobFair(int start, int end) {
            super();
            this.start = start;
            this.end = end;
        }

        public int compareTo(JobFair o) {
            return this.getEnd() - o.getEnd();
        }

    }
}
/**************************************************************
 * Problem: 1463
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:180 ms
 * Memory:24020 kb
 ****************************************************************/


                        


