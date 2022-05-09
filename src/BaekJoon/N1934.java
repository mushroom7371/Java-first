package BaekJoon;

import java.io.*;

//최소공배수
public class N1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [] inputForSplit;
        int numberA = 0;
        int numberB = 0;

        for(int i = 0; i < testCase; i++) {
            inputForSplit = br.readLine().split(" ");
            numberA = Integer.parseInt(inputForSplit[0]);
            numberB = Integer.parseInt(inputForSplit[1]);

            bw.write(getLCM(numberA, numberB) + "" + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    //최대 공약수 구하기(재귀호출)
    public static int getGCD(int numberA, int numberB){
        if(numberB == 0){
            return numberA;
        }else{
            return getGCD(numberB, numberA % numberB);
        }
    }

    //최소 공배수 구하기(최대 공약수 이용)
    public static int getLCM(int numberA, int numberB){
        return numberA * numberB / getGCD(numberA, numberB);
    }

}
