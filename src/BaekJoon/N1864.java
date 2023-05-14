package BaekJoon;

import java.io.*;

//문어 숫자
public class N1864 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("#")) {
            int numberOfEight = input.length()-1;
            int result = 0;

            for (int i = 0; i < input.length(); i++) {
                int changedNumber = changeNumber(input.charAt(i));
                result += changedNumber * Math.pow(8, numberOfEight);
                numberOfEight--;
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int changeNumber(char number) {
        switch (number) {
            case '-' :
                return 0;
            case '\\' :
                return 1;
            case '(' :
                return 2;
            case '@' :
                return 3;
            case '?' :
                return 4;
            case '>' :
                return 5;
            case '&' :
                return 6;
            case '%' :
                return 7;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        new N1864().solution();
    }
}
