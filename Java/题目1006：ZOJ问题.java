
// 题目1006：ZOJ问题

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:51
 * @url:http://ac.jobdu.com/problem.php?pid=1006
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String aa = scanner.nextLine();
            if (aa.equals("zoj")) {
                System.out.println("Accepted");

            } else if ((aa.indexOf("z") != -1 && aa.indexOf("j") != -1 && aa
                    .indexOf("o") != -1)
                    && aa.indexOf("z") == aa.lastIndexOf("z")
                    && aa.indexOf("j") == aa.lastIndexOf("j")
                    && aa.indexOf("z") < aa.indexOf("j")
                    && "".equals(aa.replace("z", "").replace("j", "").replace(
                            "o", ""))) {

                String array[] = aa.replace("z", " ").replace("j", " ").split(
                        Pattern.quote(" "));

                if (array.length == 2 && array[1].length() > 0
                        && "".equals(array[0])) {
                    System.out.println("Accepted");
                } else {
                    if (array.length == 3
                            && "".equals(array[0].replace("o", ""))
                            && "".equals(array[1].replace("o", ""))
                            && "".equals(array[2].replace("o", ""))) {

                        if (array[0].length() * array[1].length() == array[2]
                                .length()) {
                            System.out.println("Accepted");
                        } else {
                            System.out.println("Wrong Answer");
                        }
                    } else {
                        System.out.println("Wrong Answer");
                    }

                }

            } else {
                System.out.println("Wrong Answer");
            }

        }
    }

}
/**************************************************************
 Problem: 1006
 User: wzqwsrf
 Language: Java
 Result: Accepted
 Time:1080 ms
 Memory:31828 kb
 ****************************************************************/




