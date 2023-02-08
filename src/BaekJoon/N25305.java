package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//커트라인
public class N25305 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int numberOfWinner = Integer.parseInt(st.nextToken());

        int [] scoreArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        bw.write(scoreArray[scoreArray.length-numberOfWinner] + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25305().solution();
    }
}
