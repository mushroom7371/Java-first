package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

//등교
public class N31962 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int x = Integer.parseInt(input.split(" ")[1]);
        int result = -1;

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            int s = Integer.parseInt(input.split(" ")[0]);
            int t = Integer.parseInt(input.split(" ")[1]);

            if (s + t <= x) {
                result = Math.max(result, s);
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31962().solution();
    }
}
