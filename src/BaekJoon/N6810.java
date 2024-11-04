package BaekJoon;

import java.io.*;

//ISBN
public class N6810 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine()) * 3;
        int c = Integer.parseInt(br.readLine());

        int result = 91 + a + b + c;
        bw.write("The 1-3-sum is " + result);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6810().solution();
    }
}
