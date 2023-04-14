package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//2009년
public class N2948 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] dayArray = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        int [] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());

        for (int i = 0; i < month-1; i++) {
            day += monthArray[i];
        }

        bw.write(dayArray[day%7]);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2948().solution();
    }
}
