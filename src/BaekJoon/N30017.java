package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//치즈버거 만들기
public class N30017 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfPaties = Integer.parseInt(st.nextToken());
        int numberOfCheese = Integer.parseInt(st.nextToken());

        int count = 3;
        numberOfPaties -= 2;
        numberOfCheese -= 1;

        count += 2 * Math.min(numberOfPaties, numberOfCheese);

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30017().solution();
    }
}
