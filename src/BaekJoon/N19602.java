package BaekJoon;

import java.io.*;

//Dog Treats
public class N19602 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSmall = Integer.parseInt(br.readLine());
        int numberOfMedium = Integer.parseInt(br.readLine());
        int numberOfLarge = Integer.parseInt(br.readLine());

        int total = 1 * numberOfSmall + 2 * numberOfMedium + 3 * numberOfLarge;

        if (total >= 10) {
            bw.write("happy");
        } else {
            bw.write("sad");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N19602().solution();
    }
}
