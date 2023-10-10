package BaekJoon;

import java.io.*;

//좋은놈 나쁜놈
public class N4447 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfHero = Integer.parseInt(br.readLine());

        while (numberOfHero --> 0) {
            String name = br.readLine();
            int goodBad = 0;

            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (c == 'g' || c == 'G') {
                    goodBad++;
                } else if (c == 'b' || c == 'B') {
                    goodBad--;
                }
            }

            if (goodBad > 0) {
                bw.write(name + " is GOOD\n");
            } else if (goodBad < 0) {
                bw.write(name + " is A BADDY\n");
            } else {
                bw.write(name + " is NEUTRAL\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4447().solution();
    }
}
