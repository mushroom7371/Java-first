package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//욱제는 효도쟁이야!!
public class N14487 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfTown = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int sum = 0;

        while (st.hasMoreTokens()) {
            int town = Integer.parseInt(st.nextToken());
            sum += town;
            max = Math.max(max, town);
        }

        bw.write((sum - max) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14487().solution();
    }
}
