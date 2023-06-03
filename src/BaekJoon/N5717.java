package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//상근이의 친구들
public class N5717 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int numberOfBoyFriend = Integer.parseInt(st.nextToken());
            int numberOfGirlFriend = Integer.parseInt(st.nextToken());

            if (numberOfBoyFriend == 0 && numberOfGirlFriend == 0) {
                break;
            }

            bw.write(numberOfBoyFriend + numberOfGirlFriend + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5717().solution();
    }
}
