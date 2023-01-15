package BaekJoon;

import java.io.*;

//네 수
public class N10824 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numberArray = br.readLine().split(" ");
        long first = Long.parseLong(numberArray[0] + numberArray[1]);
        long second = Long.parseLong(numberArray[2] + numberArray[3]);

        bw.write(first + second + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10824().solution();
    }
}
