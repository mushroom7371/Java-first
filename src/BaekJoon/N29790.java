package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//임스의 메이플컵
public class N29790 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfSolvedProblems = Integer.parseInt(st.nextToken());
        int levelOfUnion = Integer.parseInt(st.nextToken());
        int level = Integer.parseInt(st.nextToken());

        if (numberOfSolvedProblems < 1000) {
            bw.write("Bad");
        } else {
            if (levelOfUnion >= 8000 || level >= 260) {
                bw.write("Very Good");
            } else {
                bw.write("Good");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29790().solution();
    }
}
