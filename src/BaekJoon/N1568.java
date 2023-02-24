package BaekJoon;

import java.io.*;

//새
public class N1568 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfBird = Integer.parseInt(br.readLine());
        int song = 0;
        int second = 0;

        while (true) {
            if (numberOfBird == 0) {
                break;
            }
            song++;

            if (song > numberOfBird) {
                song = 0;
            } else {
                numberOfBird -= song;
                second++;
            }
        }

        bw.write(second + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1568().solution();
    }
}
