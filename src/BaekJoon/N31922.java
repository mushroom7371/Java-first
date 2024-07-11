package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//이 대회는 이제 제 겁니다
public class N31922 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int divisionA = Integer.parseInt(st.nextToken());
        int divisionB = Integer.parseInt(st.nextToken());
        int shake = Integer.parseInt(st.nextToken());

        int result = Math.max((divisionA + shake), divisionB);
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31922().solution();
    }
}
