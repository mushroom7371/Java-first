package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//동혁 피자
public class N6502 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        while (true) {
            count++;
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            double r = Double.parseDouble(st.nextToken());
            double w = Double.parseDouble(st.nextToken());
            double l = Double.parseDouble(st.nextToken());

            w = Math.pow(w, 2);
            l = Math.pow(l, 2);
            r *= 2;

            if (r >= Math.sqrt(w + l)) {
                bw.write("Pizza " + count + " fits on the table.\n");
            } else {
                bw.write("Pizza " + count + " does not fit on the table.\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6502().solution();
    }
}
