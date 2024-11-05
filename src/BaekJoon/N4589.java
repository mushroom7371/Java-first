package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Gnome Sequencing
public class N4589 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        bw.write("Gnomes:\n");
        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean isOrdered = (a <= b && b <= c) || (a >= b && b >= c);
            bw.write(isOrdered ? "Ordered\n" : "Unordered\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4589().solution();
    }
}
