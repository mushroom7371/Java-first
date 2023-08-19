package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//대회 or 인턴
public class N2875 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfGirl = Integer.parseInt(st.nextToken());
        int numberOfBoy = Integer.parseInt(st.nextToken());
        int numberOfInternship = Integer.parseInt(st.nextToken());

        for (int i = 0; i < numberOfInternship; i++) {
            if (numberOfGirl >= 2 * numberOfBoy) {
                numberOfGirl--;
            } else {
                numberOfBoy--;
            }
        }

        int numberOfTeam = 0;
        while (numberOfGirl >= 2 && numberOfBoy >= 1) {
            numberOfGirl -= 2;
            numberOfBoy--;
            numberOfTeam++;
        }

        bw.write(String.valueOf(numberOfTeam));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2875().solution();
    }
}
