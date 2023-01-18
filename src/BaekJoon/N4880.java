package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//다음수
public class N4880 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            boolean isAp = false;

            if (second-first == third-second) {
                isAp = true;
            }

            if (isAp) {
                bw.write("AP " + (third+(second-first)) + "\n");
            } else {
                bw.write("GP " + (third*(second/first)) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4880().solution();
    }
}
