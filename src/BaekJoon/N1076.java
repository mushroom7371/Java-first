package BaekJoon;

import java.io.*;

//저항
public class N1076 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String firstResist = changeResistForSum(br.readLine());
        String secondResist = changeResistForSum(br.readLine());
        long thirdResist = changeResistForMulti(br.readLine());

        long result = Long.parseLong(firstResist + secondResist)*thirdResist;
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    String changeResistForSum(String resist) {
        switch (resist) {
            case "black" :
                return "0";
            case "brown" :
                return "1";
            case "red" :
                return "2";
            case "orange" :
                return "3";
            case "yellow" :
                return "4";
            case "green" :
                return "5";
            case "blue" :
                return "6";
            case "violet" :
                return "7";
            case "grey" :
                return "8";
        }
        return "9";
    }

    long changeResistForMulti(String resist) {
        switch (resist) {
            case "black" :
                return 1;
            case "brown" :
                return 10;
            case "red" :
                return 100;
            case "orange" :
                return 1000;
            case "yellow" :
                return 10000;
            case "green" :
                return 100000;
            case "blue" :
                return 1000000;
            case "violet" :
                return 10000000;
            case "grey" :
                return 100000000;
        }
        return 1000000000;
    }

    public static void main(String[] args) throws IOException {
        new N1076().solution();
    }
}
