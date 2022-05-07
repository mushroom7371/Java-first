package BaekJoon;

import java.io.*;

//최대공약수와 최소공배수
public class N2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] arrForSplit = br.readLine().split(" ");
        int number1 = Integer.parseInt(arrForSplit[0]);
        int number2 = Integer.parseInt(arrForSplit[1]);

        bw.write(getGCD(number1, number2) + "" + "\n");
        bw.write(getLCM(number1, number2) + "");

        br.close();
        bw.flush();
        bw.close();

    }

    //최대 공약수 구하기(재귀호출)
    public static int getGCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return getGCD(b, a % b);
        }
    }

    //최소 공배수 구하기(최대 공약수 이용)
    public static int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }
}
