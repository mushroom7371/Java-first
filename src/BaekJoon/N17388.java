package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//와글와글 숭고한
public class N17388 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int soongsil = Integer.parseInt(st.nextToken());
        int min = soongsil;
        int korea = Integer.parseInt(st.nextToken());
        if (korea < min) {
            min = korea;
        }
        int hanyang = Integer.parseInt(st.nextToken());
        if (hanyang < min) {
            min = hanyang;
        }

        if (soongsil + korea + hanyang >= 100) {
            bw.write("OK");
        } else {
            if (min == soongsil) {
                bw.write("Soongsil");
            } else if (min == korea) {
                bw.write("Korea");
            } else {
                bw.write("Hanyang");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17388().solution();
    }
}
