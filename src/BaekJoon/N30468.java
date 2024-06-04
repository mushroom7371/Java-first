package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//호반우가 학교에 지각한 이유 1
public class N30468 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int str = Integer.parseInt(st.nextToken());
        int dex = Integer.parseInt(st.nextToken());
        int intel = Integer.parseInt(st.nextToken());
        int luk = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int sum = str + dex + intel + luk;

        int count = 0;
        while (true) {
            int avg = sum / 4;
            if (avg >= target) {
                break;
            }

            sum++;
            count++;
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30468().solution();
    }
}
