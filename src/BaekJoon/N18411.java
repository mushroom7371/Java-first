package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//試験 (Exam)
public class N18411 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int resultA = a + b;
        int resultB = b + c;
        int resultC = c + a;

        if (resultA >= resultB && resultA >= resultC) {
            bw.write(resultA + "");
        } else if (resultB >= resultA && resultB >= resultC) {
            bw.write(resultB + "");
        } else {
            bw.write(resultC + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18411().solution();
    }
}
