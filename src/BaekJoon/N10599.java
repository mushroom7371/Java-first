package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//페르시아의 왕들
public class N10599 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("0 0 0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int minBirth = Integer.parseInt(st.nextToken());
            int maxBirth = Integer.parseInt(st.nextToken());
            int minDeath = Integer.parseInt(st.nextToken());
            int maxDeath = Integer.parseInt(st.nextToken());

            int min = minDeath - maxBirth;
            int max = maxDeath - minBirth;

            bw.write(min + " " + max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10599().solution();
    }
}
