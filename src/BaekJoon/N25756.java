package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//방어율 무시 계산하기
public class N25756 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPotion = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double current = 0;

        for (int i = 0; i < numberOfPotion; i++) {
            double potion = Double.parseDouble(st.nextToken()) / 100;
            current = calculate(current, potion);

            bw.write(String.format("%.6f\n", current*100));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    double calculate(double current, double potion) {
        return 1 - (1 - current) * (1 - potion);
    }

    public static void main(String[] args) throws IOException {
        new N25756().solution();
    }
}
