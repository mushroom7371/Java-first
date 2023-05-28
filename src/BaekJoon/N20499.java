package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Darius님 한타 안 함?
public class N20499 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] input = Arrays.stream(br.readLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int kill = input[0];
        int assist = input[1];
        int death = input[2];

        if (kill + death < assist || assist == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20499().solution();
    }
}
