package BaekJoon;

import java.io.*;

//9진수
public class N14491 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            result.append(number % 9);
            number /= 9;
        }

        bw.write(result.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14491().solution();

    }
}
