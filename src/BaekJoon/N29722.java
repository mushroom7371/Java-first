package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//브실혜성
public class N29722 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        day = day + n;
        while (day > 30) {
            day -= 30;
            month++;
        }
        while (month > 12) {
            month -= 12;
            year++;
        }

        String dayStr = day < 10 ? "0" + day : day + "";
        String monthStr = month < 10 ? "0" + month : month + "";
        bw.write(year + "-" + monthStr + "-" + dayStr);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29722().solution();
    }
}
