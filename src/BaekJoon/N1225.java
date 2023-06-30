package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//이상한 곱셈
public class N1225 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] firstNumber = Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray();
        int[] secondNumber = Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray();
        long result = 0;

        for (int i = 0; i < firstNumber.length; i++) {
            for (int j = 0; j < secondNumber.length; j++) {
                result += firstNumber[i] * secondNumber[j];
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1225().solution();
    }
}
