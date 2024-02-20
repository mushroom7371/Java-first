package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//유치원생 파댕이 돌보기
public class N30979 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int timeToCare = Integer.parseInt(br.readLine());
        int numberOfCandy = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfCandy; i++) {
            int candy = Integer.parseInt(st.nextToken());
            timeToCare -= candy;
        }

        if (timeToCare > 0) {
            bw.write("Padaeng_i Cry");
        } else {
            bw.write("Padaeng_i Happy");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30979().solution();
    }
}
