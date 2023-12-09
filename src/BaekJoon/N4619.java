package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//루트
public class N4619 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int numberOne = 0;
            int numberTwo = 0;
            int A = 0;
            while (true) {
                if (Math.pow(A, N) <= B) {
                    numberOne = A;
                } else if (Math.pow(A, N) > B) {
                    numberTwo = A;
                    break;
                }
                A++;
            }

            int result = (Math.abs(Math.pow(numberOne, N) - B) <= Math.abs(Math.pow(numberTwo, N) - B)) ? numberOne : numberTwo;

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4619().solution();
    }
}
