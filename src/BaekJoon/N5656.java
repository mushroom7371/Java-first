package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//비교 연산자
public class N5656 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        while (true) {
            count++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            int second = Integer.parseInt(st.nextToken());

            if (operator.equals("E")) {
                break;
            }

            bw.write("Case " + count + ": " + compare(first, operator, second));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String compare(int first, String operator, int second) {
        switch (operator) {
            case ">":
                return first > second ? "true\n" : "false\n";
            case ">=":
                return first >= second ? "true\n" : "false\n";
            case "<":
                return first < second ? "true\n" : "false\n";
            case "<=":
                return first <= second ? "true\n" : "false\n";
            case "==":
                return first == second ? "true\n" : "false\n";
            case "!=":
                return first != second ? "true\n" : "false\n";
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        new N5656().solution();
    }
}
