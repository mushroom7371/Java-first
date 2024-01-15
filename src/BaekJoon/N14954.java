package BaekJoon;

import java.io.*;

//Happy Number
public class N14954 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        while (true) {
            number = getSumOfSquare(number);
            if (number == 1) {
                bw.write("HAPPY");
                break;
            } else if (number == 4) {
                bw.write("UNHAPPY");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int getSumOfSquare(int number) {
        int sum = 0;
        while (number != 0) {
            sum += Math.pow(number % 10, 2);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        new N14954().solution();
    }
}
