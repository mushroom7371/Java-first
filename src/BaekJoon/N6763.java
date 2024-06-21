package BaekJoon;

import java.io.*;

//Speed fines are not fine!
public class N6763 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int speedLimit = Integer.parseInt(br.readLine());
        int driverSpeed = Integer.parseInt(br.readLine());

        int overSpeed = driverSpeed - speedLimit;
        if (overSpeed >= 31) {
            bw.write("You are speeding and your fine is $500.");
        } else if (overSpeed >= 21) {
            bw.write("You are speeding and your fine is $270.");
        } else if (overSpeed >= 1) {
            bw.write("You are speeding and your fine is $100.");
        } else {
            bw.write("Congratulations, you are within the speed limit!");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6763().solution();
    }
}
