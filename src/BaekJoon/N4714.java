package BaekJoon;

import java.io.*;

//Lunacy
public class N4714 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            double weight = Double.parseDouble(br.readLine());
            if (weight == -1.0) {
                break;
            }

            double result = weight * 0.167;

            bw.write("Objects weighing " + String.format("%.2f", weight) + " on Earth will weigh " + String.format("%.2f", result) + " on the moon.\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4714().solution();
    }
}
