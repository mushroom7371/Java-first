package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//노 땡스!
public class N27159 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCards = Integer.parseInt(br.readLine());
        int[] cards = new int[36];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numberOfCards; i++) {
            cards[Integer.parseInt(st.nextToken())]++;
        }

        int sum = 0;

        for (int i = 3; i <= 35; i++) {
            if (cards[i-1] == 0 && cards[i] != 0) {
                sum += i;
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27159().solution();
    }
}
