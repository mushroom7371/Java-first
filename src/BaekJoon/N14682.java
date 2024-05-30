package BaekJoon;

import java.io.*;

//Shifty Sum
public class N14682 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        int shift = Integer.parseInt(br.readLine());

        int sum = number;
        for (int i = 0; i < shift; i++) {
            number *= 10;
            sum += number;
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14682().solution();
    }
}
