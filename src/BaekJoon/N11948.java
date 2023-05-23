package BaekJoon;

import java.io.*;

//과목선택
public class N11948 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = 100;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;

            if (min > number) {
                min = number;
            }
        }

        sum -= min;
        min = 100;

        for (int i = 0; i < 2; i++) {
            int number = Integer.parseInt(br.readLine());
            sum += number;

            if (min > number) {
                min = number;
            }
        }

        sum -= min;
        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11948().solution();
    }
}
