package BaekJoon;

import java.io.*;

//이 별은 무슨 색일까
public class N30676 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int waveLength = Integer.parseInt(br.readLine());

        if (waveLength >= 620 && waveLength <= 780) {
            bw.write("Red");
        } else if (waveLength >= 590 && waveLength <= 620) {
            bw.write("Orange");
        } else if (waveLength >= 570 && waveLength <= 590) {
            bw.write("Yellow");
        } else if (waveLength >= 495 && waveLength <= 570) {
            bw.write("Green");
        } else if (waveLength >= 450 && waveLength <= 495) {
            bw.write("Blue");
        } else if (waveLength >= 425 && waveLength <= 450) {
            bw.write("Indigo");
        } else {
            bw.write("Violet");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30676().solution();
    }
}
