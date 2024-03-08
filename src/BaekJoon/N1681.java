package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//줄 세우기
public class N1681 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfStudent = Integer.parseInt(st.nextToken());
        int skip = Integer.parseInt(st.nextToken());
        int count = 0;
        int number = 0;

        while (count < numberOfStudent) {
            number++;
            if (!String.valueOf(number).contains(String.valueOf(skip))) {
                count++;
            }
        }

        bw.write(number + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1681().solution();
    }
}
