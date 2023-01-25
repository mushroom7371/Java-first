package BaekJoon;

import java.io.*;
import java.util.Arrays;

//연길이의 이상형
public class N20540 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        String [] yeonGilMbti = br.readLine().split("");

//        Arrays.stream(br.readLine().split("")) 이렇게 가능!
//                .map(this::changeMBTI)
//                .forEach(System.out::print);

        for (int i = 0; i < yeonGilMbti.length; i++) {
            result.append(changeMBTI(yeonGilMbti[i]));
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

    String changeMBTI(String input) {
        switch (input) {
            case "E" :
                return "I";
            case "I" :
                return "E";
            case "S" :
                return "N";
            case "N" :
                return "S";
            case "T" :
                return "F";
            case "F" :
                return "T";
            case "J" :
                return "P";
        }
        return "J";
    }

    public static void main(String[] args) throws IOException {
        new N20540().solution();
    }
}
