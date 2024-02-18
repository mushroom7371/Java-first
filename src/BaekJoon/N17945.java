package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//통학의 신
public class N17945 {

    void solution()  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int root = (int) Math.sqrt(a * a - b);
        int result1 = -a - root;
        int result2 = -a + root;

        if (result1 == result2) {
            bw.write(result1 + "\n");
        } else {
            bw.write(result1 + " " + result2 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17945().solution();
    }
}
