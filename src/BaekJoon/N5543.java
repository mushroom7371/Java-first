package BaekJoon;

import java.io.*;

//상근날드
public class N5543 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int minBuggerPrice = 2000;
        for (int i = 0; i < 3; i++) {
            int buggerPrice = Integer.parseInt(br.readLine());

            if (minBuggerPrice > buggerPrice) {
                minBuggerPrice = buggerPrice;
            }
        }

        int minDrinkPrice = 2000;
        for (int i = 0; i < 2; i++) {
            int drinkPrice = Integer.parseInt(br.readLine());

            if (minDrinkPrice > drinkPrice) {
                minDrinkPrice = drinkPrice;
            }
        }

        int result = minBuggerPrice + minDrinkPrice - 50;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5543().solution();
    }
}
