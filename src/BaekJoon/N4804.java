package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Viva la Diferencia
public class N4804 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0 0 0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int count = 0;
            while (true) {
                if (a == b && b == c && c == d) {
                    break;
                }

                int tempA = Math.abs(a - b);
                int tempB = Math.abs(b - c);
                int tempC = Math.abs(c - d);
                int tempD = Math.abs(d - a);

                a = tempA;
                b = tempB;
                c = tempC;
                d = tempD;

                count++;
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4804().solution();
    }
}
