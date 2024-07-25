package BaekJoon;

import java.io.*;

//조별과제를 하려는데 조장이 사라졌다
public class N15727 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int distance = Integer.parseInt(br.readLine());
        int minutes = 0;

        minutes += distance/5;
        distance = distance%5;

        minutes += distance/4;
        distance = distance%4;

        minutes += distance/3;
        distance = distance%3;

        minutes += distance/2;
        distance = distance%2;

        minutes += distance;

        bw.write(minutes + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15727().solution();
    }
}
