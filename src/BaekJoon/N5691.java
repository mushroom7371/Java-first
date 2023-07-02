package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//평균 중앙값 문제
public class N5691 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        StringTokenizer st;

        while (!(input = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(input);
            int numberA = Integer.parseInt(st.nextToken());
            int numberB = Integer.parseInt(st.nextToken());

            bw.write((numberA - (numberB - numberA)) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5691().solution();
    }
}
