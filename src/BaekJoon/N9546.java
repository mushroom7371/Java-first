package BaekJoon;

import java.io.*;

//3000번 버스
public class N9546 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfStation = Integer.parseInt(br.readLine());
            int numberOfPassenger = 0;

            for (int i = 0; i < numberOfStation; i++) {
                numberOfPassenger = numberOfPassenger * 2 + 1;
            }

            bw.write(numberOfPassenger + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9546().solution();
    }
}
