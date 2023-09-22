package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//이칙연산
public class N15726 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double firstNumber = Double.parseDouble(st.nextToken());
        double secondNumber = Double.parseDouble(st.nextToken());
        double thirdNumber = Double.parseDouble(st.nextToken());

        if ((firstNumber * secondNumber / thirdNumber) > (firstNumber / secondNumber * thirdNumber)) {
            bw.write((int)(firstNumber * secondNumber / thirdNumber) + "");
        } else {
            bw.write((int)(firstNumber / secondNumber * thirdNumber) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15726().solution();
    }
}
