package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Previous Level
public class N28453 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfLevel = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numberOfLevel; i++) {
            int level = Integer.parseInt(st.nextToken());

            if (level == 300) {
                bw.write("1");
            } else if (level >= 275) {
                bw.write("2");
            } else if (level >= 250) {
                bw.write("3");
            } else {
                bw.write("4");
            }

            if (i != numberOfLevel - 1) {
                bw.write(" ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28453().solution();
    }
}
