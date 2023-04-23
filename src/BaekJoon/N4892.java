package BaekJoon;

import java.io.*;

//숫자 맞추기 게임
public class N4892 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        int count = 0;

        while (!(input = br.readLine()).equals("0")) {
            count++;
            int nZero = Integer.parseInt(input);
            int nOne = 3*nZero;
            int nTwo = 0;
            int nThree = 0;
            int nFour = 0;

            if (nOne%2 == 0) {
                nTwo = nOne/2;
            } else {
                nTwo = (nOne+1)/2;
            }

            nThree = 3*nTwo;

            nFour = nThree/9;

            if (nOne%2 == 0) {
                bw.write(count + ". even " + nFour + "\n");
            } else {
                bw.write(count + ". odd " + nFour + "\n");
            }

        }



        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4892().solution();
    }
}
