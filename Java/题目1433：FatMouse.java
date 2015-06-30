
// 题目1433：FatMouse

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1433
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    /*
     * 1433
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(
                new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int m = (int) st.nval;
            st.nextToken();
            int n = (int) st.nval;
            if (m == -1 && n == -1) {
                break;
            }
            FatMouse[] fatMouses = new FatMouse[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int javaPounds = (int) st.nval;
                st.nextToken();
                int catPounds = (int) st.nval;
                double rate = (double) javaPounds / (double) catPounds;
                fatMouses[i] = new FatMouse(javaPounds, catPounds, rate);
            }
            Arrays.sort(fatMouses);
            double res = 0;
            int k = 0;
            while (m > 0 && k < n) {
                int catPounds = fatMouses[k].getCatPounds();
                if (m > catPounds) {
                    m -= catPounds;
                    res += (double) fatMouses[k].getJavaPounds();
                } else {
                    res += (double) m * fatMouses[k].getRate();
                    m = 0;
                }
                k++;
            }
            System.out.printf("%.3f\n", res);
        }
    }

    static class FatMouse implements Comparable<FatMouse> {

        private int javaPounds;
        private int catPounds;
        private double rate;

        public int getJavaPounds() {
            return javaPounds;
        }

        public void setJavaPounds(int javaPounds) {
            this.javaPounds = javaPounds;
        }

        public int getCatPounds() {
            return catPounds;
        }

        public void setCatPounds(int catPounds) {
            this.catPounds = catPounds;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public FatMouse(int javaPounds, int catPounds, double rate) {
            super();
            this.javaPounds = javaPounds;
            this.catPounds = catPounds;
            this.rate = rate;
        }

        public int compareTo(FatMouse o) {
            if (this.getRate() > o.getRate()) {
                return -1;
            } else if (this.getRate() < o.getRate()) {
                return 1;
            }
            return 0;
        }
    }
}
/**************************************************************
 * Problem: 1433
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:240 ms
 * Memory:34804 kb
 ****************************************************************/


                        


