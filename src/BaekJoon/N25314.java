package BaekJoon;

import java.io.*;

//코딩은 체육과목 입니다
public class N25314 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine()) / 4;
        String longSpaceString = "long ";

        for (int i = 0; i < target; i++) {
            bw.write(longSpaceString);
        }
        bw.write("int");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25314().solution();
    }
}
