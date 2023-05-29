package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//CASIO
public class N15963 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String songChanBattery = st.nextToken();
        String teacherBattery = st.nextToken();

        if (songChanBattery.equals(teacherBattery)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15963().solution();
    }
}
