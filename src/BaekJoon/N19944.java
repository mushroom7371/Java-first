package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//뉴비의 기준은 뭘까?
public class N19944 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int standardsOfOldbie = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        if (target == 1 || target == 2) {
            bw.write("NEWBIE!");
        } else if (target <= standardsOfOldbie) {
            bw.write("OLDBIE!");
        } else {
            bw.write("TLE!");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N19944().solution();
    }
}
