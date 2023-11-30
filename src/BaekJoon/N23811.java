package BaekJoon;

import java.io.*;

//골뱅이 찍기 - ㅌ
public class N23811 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();
        printAtSign(number, result, 'A');
        printAtSign(number, result, 'B');
        printAtSign(number, result, 'A');
        printAtSign(number, result, 'B');
        printAtSign(number, result, 'A');

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    void printAtSign(int number, StringBuilder result, char type) {
        for (int i = 0; i < number; i++) {
            if (type == 'A') {
                for (int j = 0; j < 5 * number; j++) {
                    result.append("@");
                }
                result.append("\n");
            } else {
                for (int j = 0; j < number; j++) {
                    result.append("@");
                }
                result.append("\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new N23811().solution();
    }
}
