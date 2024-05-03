package BaekJoon;

import java.io.*;

//Telemarketer or not?
public class N16017 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String firstNumber = br.readLine();
        String secondNumber = br.readLine();
        String thirdNumber = br.readLine();
        String fourthNumber = br.readLine();

        if (!secondNumber.equals(thirdNumber)) {
            bw.write("answer");
        } else if (firstNumber.equals("8") || firstNumber.equals("9")) {
            if (fourthNumber.equals("8") || fourthNumber.equals("9")) {
                bw.write("ignore");
            } else {
                bw.write("answer");
            }
        } else {
            bw.write("answer");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16017().solution();
    }
}
