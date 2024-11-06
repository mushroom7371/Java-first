package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//양파 실험
public class N32369 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int lengthA = 1;
        int lengthB = 1;

        while (day --> 0) {
            lengthA += a;
            lengthB += b;

            if (lengthA == lengthB) {
                lengthB--;
            } else if (lengthA < lengthB) {
                int temp = lengthA;
                lengthA = lengthB;
                lengthB = temp;
            }
        }

        bw.write(lengthA + " " + lengthB);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32369().solution();
    }
}
