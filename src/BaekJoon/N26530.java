package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Shipping
public class N26530 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int n = Integer.parseInt(br.readLine());
            double result = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                int b = Integer.parseInt(st.nextToken());
                double c = Double.parseDouble(st.nextToken());

                result += b * c;
            }

            bw.write(String.format("$%.2f\n", result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26530().solution();
    }
}
