package BaekJoon;

import java.io.*;

//アイスクリーム (Ice Cream)
public class N24087 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int price = 250;
        while (s > a) {
            a += b;
            price += 100;
        }

        bw.write(price + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24087().solution();
    }
}
