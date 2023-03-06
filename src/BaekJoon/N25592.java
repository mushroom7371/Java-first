package BaekJoon;

import java.io.*;

//바둑돌 게임
public class N25592 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStone = Integer.parseInt(br.readLine());
        int count = 1;

        while (numberOfStone >= 0) {
            numberOfStone -= count;

            count++;
        }

        if (count % 2 != 0) {
            bw.write("0");
        } else {
            bw.write(Math.abs(numberOfStone) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25592().solution();
    }
}
