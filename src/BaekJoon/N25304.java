package BaekJoon;

import java.io.*;

//영수증
public class N25304 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalPrice = Integer.parseInt(br.readLine());
        int kindOfMenu = Integer.parseInt(br.readLine());
        int calculatedPrice = 0;

        while (kindOfMenu --> 0) {
            String[] input = br.readLine().split(" ");
            calculatedPrice += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        }

        if (calculatedPrice == totalPrice) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25304().solution();
    }
}
