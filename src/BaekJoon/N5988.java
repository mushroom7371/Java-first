package BaekJoon;

import java.io.*;

//홀수일까 짝수일까
public class N5988 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            String stringNumber = br.readLine();
            int number = stringNumber.charAt(stringNumber.length() - 1) - '0';

            if(number % 2 == 0){
                bw.write("even\n");
            }else{
                bw.write("odd\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5988().solution();
    }
}
