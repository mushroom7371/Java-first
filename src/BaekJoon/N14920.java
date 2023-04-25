package BaekJoon;

import java.io.*;

//3n+1 수열
public class N14920 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        int count = 1;

        while (number != 1) {
            count++;
            number = calculate(number);
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    int calculate(int number) {
        int result = number/2;

        if (number % 2 != 0) {
            result = 3*number + 1;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        new N14920().solution();
    }
}
