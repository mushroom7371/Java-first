package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//폰 노이만
public class N9469 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testNumber = Integer.parseInt(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());

            double result = d / (a + b) * f;

            bw.write(testNumber + " " + String.format("%.6f", result) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9469().solution();
    }
}
