package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//기념일 2
public class N10426 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String yearMonthDay = st.nextToken();
        int totalDays = Integer.parseInt(st.nextToken()) - 1;
        st = new StringTokenizer(yearMonthDay, "-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        while (totalDays > 0) {
            if (day + totalDays > daysInMonth[month - 1]) {
                totalDays -= daysInMonth[month - 1] - day + 1;
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                    if (isLeapYear(year)) {
                        daysInMonth[1] = 29;
                    } else {
                        daysInMonth[1] = 28;
                    }
                }
            } else {
                day += totalDays;
                totalDays = 0;
            }
        }

        bw.write(year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day));

        br.close();
        bw.flush();
        bw.close();
    }

    boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) throws IOException {
        new N10426().solution();
    }
}
