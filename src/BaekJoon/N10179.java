package BaekJoon;

import java.io.*;

//쿠폰
public class N10179 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            double price = Double.parseDouble(br.readLine());
            double discountRate = 0.2;

            bw.write("$" + String.format("%.2f", price*(1 - discountRate)) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10179().solution();
    }
}
