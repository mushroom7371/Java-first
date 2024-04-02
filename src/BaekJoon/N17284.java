package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Vending Machine
public class N17284 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] prices = new int[3];

        int sum = 0;
        while (st.hasMoreTokens()) {
            int button = Integer.parseInt(st.nextToken());
            if (button == 1) {
                sum += 500;
            } else if (button == 2) {
                sum += 800;
            } else if (button == 3) {
                sum += 1000;
            }
        }

        bw.write(String.valueOf(5000 - sum));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17284().solution();
    }
}
