package BaekJoon;

import java.io.*;

//소음
public class N2935 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputA = br.readLine();
        String operator = br.readLine();
        String inputB = br.readLine();
        StringBuilder result = new StringBuilder();

        if (operator.equals("*")) {
            result.append("1");

            for (int i = 0; i < inputA.length() + inputB.length() - 2; i++) {
                result.append("0");
            }
        } else {
            if (inputA.length() > inputB.length()) {
                for (int i = 0; i < inputA.length() - inputB.length(); i++) {
                    result.append(inputA.charAt(i));
                }
                for (int i = 0; i < inputB.length(); i++) {
                    result.append(inputB.charAt(i));
                }
            } else if (inputA.length() < inputB.length()){
                for (int i = 0; i < inputB.length() - inputA.length(); i++) {
                    result.append(inputB.charAt(i));
                }
                for (int i = 0; i < inputA.length(); i++) {
                    result.append(inputB.charAt(i));
                }
            } else {
                result.append("2");
                for (int i = 0; i < inputA.length() -1; i++){
                    result.append("0");
                }
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2935().solution();
    }
}
