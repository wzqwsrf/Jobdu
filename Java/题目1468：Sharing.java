
// 题目1468：Sharing

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1468
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
     * 1468
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array[] = new String[1000000];
        Map<String, String> storeMap = new HashMap<String, String>();
        while (scanner.hasNext()) {
            String astart = scanner.next();
            String bstart = scanner.next();
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                String firStr = scanner.next();
                String letter = scanner.next();
                String next = scanner.next();
                storeMap.put(firStr, next);
                array[Integer.parseInt(firStr)] = letter;
            }

            String anext = astart;
            String bnext = bstart;
            int alen = 0;
            while (!anext.equals("-1")) {
                anext = storeMap.get(anext);
                alen++;
            }

            int blen = 0;
            while (!bnext.equals("-1")) {
                bnext = storeMap.get(bnext);
                blen++;
            }
            anext = astart;
            bnext = bstart;
            if (alen == blen) {
                while (!anext.equals(bnext)) {
                    if (anext.equals("-1")) {
                        break;
                    }
                    anext = storeMap.get(anext);
                    bnext = storeMap.get(bnext);
                }
                System.out.println(anext);
            } else if (alen > blen) {
                int i = 0;
                while (i < (alen - blen)) {
                    anext = storeMap.get(anext);
                    i++;
                }
                while (!anext.equals(bnext)) {
                    if (anext.equals("-1")) {
                        break;
                    }
                    anext = storeMap.get(anext);
                    bnext = storeMap.get(bnext);
                }
                System.out.println(anext);
            } else {
                int i = 0;
                while (i < (blen - alen)) {
                    bnext = storeMap.get(bnext);
                    i++;
                }
                while (!anext.equals(bnext)) {
                    if (anext.equals("-1")) {
                        break;
                    }
                    anext = storeMap.get(anext);
                    bnext = storeMap.get(bnext);
                }
                System.out.println(anext);
            }
        }
    }
}
/**************************************************************
 * Problem: 1468
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:2990 ms
 * Memory:235160 kb
 ****************************************************************/




