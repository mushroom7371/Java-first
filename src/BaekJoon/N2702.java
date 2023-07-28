package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//초6 수학
public class N2702 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int firstNumber = Integer.parseInt(st.nextToken());
            int secondNumber = Integer.parseInt(st.nextToken());

            bw.write(lcm(firstNumber, secondNumber) + " " + gcd(firstNumber, secondNumber) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        new N2702().solution();
    }
}
