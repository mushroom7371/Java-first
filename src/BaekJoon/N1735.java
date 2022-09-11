package BaekJoon;

import java.io.*;
import java.util.Arrays;

//분수 합
public class N1735 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] firstFraction = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] secondFraction = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int denominator = firstFraction[1] * secondFraction[1];    //분모
        int numerator = (firstFraction[0] * secondFraction[1]) + (secondFraction[0] * firstFraction[1]);  //분자
        int gcd = getGcd(denominator, numerator);

        bw.write(numerator/gcd + " " + denominator/gcd);
        br.close();
        bw.flush();
        bw.close();

    }

    int getGcd(int a, int b){
        if(b == 0){
            return a;
        }

        return getGcd(b, a % b);
    }

    public static void main(String[] args) throws IOException{
        new N1735().solution();
    }
}