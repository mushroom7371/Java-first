package BaekJoon;

import java.io.*;

//알고리즘 수업 - 알고리즘의 수행 시간 2
public class N24263 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());

        bw.write(target + "\n1");

        br.close();
        bw.flush();
        bw.close();
    }




    public static void main(String[] args) throws IOException {
        new N24263().solution();
    }
}
