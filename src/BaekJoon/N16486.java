package BaekJoon;

import java.io.*;

//운동장 한 바퀴
public class N16486 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int width = Integer.parseInt(br.readLine());
        int diameter = Integer.parseInt(br.readLine());
        double pi = 3.141592;

        double result = width*2 + 2*pi*diameter;

        bw.write(String.format("%.6f", result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16486().solution();
    }
}
