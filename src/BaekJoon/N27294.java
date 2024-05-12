package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//몇개고?
public class N27294 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int alcohol = Integer.parseInt(st.nextToken());

        if (time >= 12 && time <= 16) {
            if (alcohol == 0) {
                bw.write("320");
            } else {
                bw.write("280");
            }
        } else {
            bw.write("280");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27294().solution();
    }
}
