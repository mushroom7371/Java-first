package BaekJoon;

import java.io.*;

//공백 없는 A+B
public class N15873 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int firstNumber = 0;
        int secondNumber = 0;

        if (input.charAt(input.length()-1) == '0' && input.charAt(input.length()-2) == '1') {
            firstNumber = Integer.parseInt(input.substring(0, input.length()-2));
            secondNumber = 10;
        } else if (input.charAt(input.length()-1) == '0' && input.charAt(input.length()-2) != '1') {
            firstNumber = Integer.parseInt(input.substring(0, input.length()-1));
            secondNumber = 0;
        } else {
            firstNumber = Integer.parseInt(input.substring(0, input.length()-1));
            secondNumber = Integer.parseInt(input.substring(input.length()-1));
        }

        bw.write(firstNumber + secondNumber + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15873().solution();
    }
}
