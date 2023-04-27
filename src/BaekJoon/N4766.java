package BaekJoon;

import java.io.*;

//일반 화학 실험
public class N4766 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double temperature = Double.parseDouble(br.readLine());
        double input = 0;

        while ((input = Double.parseDouble(br.readLine())) != 999) {
            double result = input - temperature;
            temperature = input;

            bw.write(String.format("%.2f", result) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4766().solution();
    }
}
