
// 题目1499：项目安排

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1499
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1499
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            Project projects[] = new Project[n + 1];
            for (int i = 1; i < n + 1; i++) {
                st.nextToken();
                int start = (int) st.nval;
                st.nextToken();
                int end = (int) st.nval;
                st.nextToken();
                int value = (int) st.nval;
                projects[i] = new Project(start, end, value);
            }
            Arrays.sort(projects, 1, n + 1);
            int dp[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                int j;
                for (j = i - 1; j > 0; j--) {
                    if (projects[i].st >= projects[j].ed) {
                        break;
                    }
                }
                dp[i] = Math.max(dp[i - 1], dp[j] + projects[i].val);
            }
            System.out.println(dp[n]);
        }
    }

    private static class Project implements Comparable<Project> {
        private int st;
        private int ed;
        private int val;

        public Project(int st, int ed, int val) {
            super();
            this.st = st;
            this.ed = ed;
            this.val = val;
        }

        public int compareTo(Project o) {
            if (this.ed < o.ed) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

/**************************************************************
 * Problem: 1499
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:2320 ms
 * Memory:48580 kb
 ****************************************************************/


                        


