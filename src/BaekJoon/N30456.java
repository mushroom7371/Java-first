package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//바닥수
public class N30456 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=  new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int i = 0; i < l; i++) {
            if (i == l - 1) {
                bw.write(n + "");
                break;
            }
            bw.write("1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30456().solution();
    }
}
