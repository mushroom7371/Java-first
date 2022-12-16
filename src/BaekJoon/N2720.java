package BaekJoon;

import java.io.*;

//세탁소 사장 동혁
public class N2720 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int money = Integer.parseInt(br.readLine());

            if (money / 25 > 0) {
                bw.write(money / 25 + " ");
                money %= 25;
            }else{
                bw.write(0 + " ");
            }

            if (money / 10 > 0) {
                bw.write(money / 10 + " ");
                money %= 10;
            }else{
                bw.write(0 + " ");
            }

            if (money / 5 > 0) {
                bw.write(money / 5 + " ");
                money %= 5;
            }else{
                bw.write(0 + " ");
            }

            if (money / 1 > 0) {
                bw.write(money / 1 + " ");
                money %= 1;
            }else{
                bw.write(0 + " ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2720().solution();
    }
}
