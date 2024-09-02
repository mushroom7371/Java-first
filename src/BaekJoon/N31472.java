package BaekJoon;

import java.io.*;

//갈래의 색종이 자르기
public class N31472 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int w = Integer.parseInt(br.readLine());
        int result = (int) (Math.sqrt(2 * w) * 4);

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31472().solution();
    }
}
