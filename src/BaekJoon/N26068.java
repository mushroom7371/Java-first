package BaekJoon;

import java.io.*;

//치킨댄스를 추는 곰곰이를 본 임스 2
public class N26068 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCoupon = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < numberOfCoupon; i++) {
            int day = Integer.parseInt(br.readLine().substring(2));

            if (day <= 90) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26068().solution();
    }
}
