package BaekJoon;

import java.io.*;

//Oddities
public class N10480 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int number = Integer.parseInt(br.readLine());

            if (number % 2 == 0) {
                bw.write(number + " is even\n");
            } else {
                bw.write(number + " is odd\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10480().solution();
    }
}
