package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Transactions
public class N2975 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0 W 0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            int money = Integer.parseInt(st.nextToken());
            String type = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            if (type.equals("D")) {
                money += value;
            } else {
                money -= value;
            }

            if (money < -200) {
                bw.write("Not allowed\n");
            } else {
                bw.write(money + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2975().solution();
    }
}
