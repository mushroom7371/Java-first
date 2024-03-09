package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//나는 너가 살아온 날을 알고 있다
public class N2139 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (day == 0 && month == 0 && year == 0) {
                break;
            }

            boolean isLeapYear = isLeapYear(year);

            int[] monthArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
            if (isLeapYear) {
                monthArr[1] = 29;
            }

            int result = 0;
            for (int i = 0; i < month - 1; i++) {
                result += monthArr[i];
            }
            result += day;

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) throws IOException {
        new N2139().solution();
    }
}
