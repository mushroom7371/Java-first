package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//고급 여관
public class N12756 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int powerA = Integer.parseInt(st.nextToken());
        int lifeA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int powerB = Integer.parseInt(st.nextToken());
        int lifeB = Integer.parseInt(st.nextToken());

        while (lifeA > 0 && lifeB > 0) {
            lifeA -= powerB;
            lifeB -= powerA;
        }

        if (lifeA <= 0 && lifeB <= 0) {
            bw.write("DRAW");
        } else if (lifeA <= 0) {
            bw.write("PLAYER B");
        } else {
            bw.write("PLAYER A");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12756().solution();
    }
}
