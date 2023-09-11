package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//멀티탭 충분하니?
public class N15780 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfStudnet = Integer.parseInt(st.nextToken());
        int numberOfMultiTap = Integer.parseInt(st.nextToken());
        int availableSocket = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfMultiTap; i++) {
            availableSocket += (Integer.parseInt(st.nextToken()) + 1) / 2;
        }

        if (availableSocket >= numberOfStudnet) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15780().solution();
    }
}
