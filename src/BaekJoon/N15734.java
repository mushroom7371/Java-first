package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//명장 남정훈
public class N15734 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int leftFoot = Integer.parseInt(st.nextToken());
        int rightFoot = Integer.parseInt(st.nextToken());
        int allFoot = Integer.parseInt(st.nextToken());

        while (allFoot --> 0) {
            if (leftFoot > rightFoot) {
                rightFoot++;
            } else {
                leftFoot++;
            }
        }

        if (leftFoot == rightFoot) {
            bw.write(leftFoot + rightFoot + "");
        } else {
            bw.write(Math.min(leftFoot, rightFoot) * 2 + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15734().solution();
    }
}
