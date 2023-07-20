package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//폰 노이만과 파리
public class N14924 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int speedOfTrain = Integer.parseInt(st.nextToken());
        int speedOfFly = Integer.parseInt(st.nextToken());
        int distanceOfTrain = Integer.parseInt(st.nextToken());

        int time = distanceOfTrain / (speedOfTrain * 2);
        int distanceOfFly = time * speedOfFly;

        bw.write(String.valueOf(distanceOfFly));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14924().solution();
    }
}
