package BaekJoon;

import java.io.*;

//2023은 무엇이 특별할까?
public class N31090 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();
            String[] inputArray = input.split("");
            int number = Integer.parseInt(input);
            int year = number + 1;
            int target = Integer.parseInt((inputArray[inputArray.length-2] + inputArray[inputArray.length-1]));

            if (year % target == 0) {
                bw.write("Good\n");
            } else {
                bw.write("Bye\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31090().solution();
    }
}
