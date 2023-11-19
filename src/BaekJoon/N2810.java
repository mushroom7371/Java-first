package BaekJoon;

import java.io.*;

//컵홀더
public class N2810 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSeats = Integer.parseInt(br.readLine());
        char[] seats = br.readLine().toCharArray();
        int count = 1;

        for (int i = 0; i < numberOfSeats; i++) {
            count++;
            if (seats[i] != 'S') {
                i++;
            }
        }

        bw.write(Math.min(count, numberOfSeats) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2810().solution();
    }
}
