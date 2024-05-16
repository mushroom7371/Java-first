package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//미션 도네이션
public class N25965 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int n = Integer.parseInt(br.readLine());
            long[][] arr = new long[n][3];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Long.parseLong(st.nextToken());
                arr[i][1] = Long.parseLong(st.nextToken());
                arr[i][2] = Long.parseLong(st.nextToken());
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            long k = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());

            long result = 0;
            for (int i = 0; i < n; i++) {
                long temp = arr[i][0] * k - arr[i][1] * d + arr[i][2] * a;
                if (temp > 0) {
                    result += temp;
                }
            }

            bw.write(result + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25965().solution();
    }
}
