package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//파일 옮기기
public class N11943 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstBasketApple = Integer.parseInt(st.nextToken());
        int firstBasketOrange = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int secondBasketApple = Integer.parseInt(st.nextToken());
        int secondBasketOrange = Integer.parseInt(st.nextToken());

        bw.write(Math.min(firstBasketApple + secondBasketOrange, firstBasketOrange + secondBasketApple) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11943().solution();
    }
}
