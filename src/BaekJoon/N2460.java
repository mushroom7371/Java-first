package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//지능형 기차 2
public class N2460 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = 10;
        int maxPeople = 0;
        int currentPeople = 0;

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int outPeople = Integer.parseInt(st.nextToken());
            int inPeople = Integer.parseInt(st.nextToken());

            if (testCase == 10) {
                currentPeople += inPeople;
            } else if (testCase == 1) {
                currentPeople -= outPeople;
            } else {
                currentPeople = currentPeople - outPeople + inPeople;
            }

            if (maxPeople <= currentPeople) {
                maxPeople = currentPeople;
            }

        }

        bw.write(maxPeople + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2460().solution();
    }
}
