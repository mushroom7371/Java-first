package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//모범생 포닉스
public class N28097 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNumber = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 8 * (caseNumber - 1);
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }

        int day = sum / 24;
        int hour = sum % 24;

        bw.write(day + " " + hour);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28097().solution();
    }
}
