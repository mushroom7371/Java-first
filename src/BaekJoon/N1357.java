package BaekJoon;

import java.io.*;

//뒤집힌 덧셈
public class N1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numberArray = br.readLine().split(" ");
        int reverseNumber1 = rev(numberArray[0]);
        int reverseNumber2 = rev(numberArray[1]);

        br.close();
        bw.write();
        bw.flush();
        bw.close();

    }

    static int rev(String number){
        String targetNum = "";

        for(int i = number.length() - 1; i >= 0; i--){
            targetNum += number.charAt(i);
        }

        return Integer.parseInt(targetNum);
    }
}
