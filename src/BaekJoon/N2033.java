package BaekJoon;

import java.io.*;

//반올림
public class N2033 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int number = Integer.parseInt(input);
        int index = 1;

        for (int i = 0; i < input.length()-1; i++) {
            index *= 10;

            number = roundOff(number, index);
        }

        bw.write(number + "");

        br.close();
        bw.flush();
        bw.close();
    }

    int roundOff(int number, int index) {
        int result = (number/index)*index;
        double temp = (double) (number%index)/index;

        if (temp >= 0.5) {
            result += index;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        new N2033().solution();
    }
}
