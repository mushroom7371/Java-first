package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//정보섬의 대중교통
public class N28113 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int walkTime = Integer.parseInt(st.nextToken());
        int busTime = Integer.parseInt(st.nextToken());
        int subwayTime = Integer.parseInt(st.nextToken());

        if (busTime == subwayTime) {
            bw.write("Anything");
        } else if (busTime < subwayTime) {
            bw.write("Bus");
        } else {
            bw.write("Subway");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28113().solution();
    }
}
