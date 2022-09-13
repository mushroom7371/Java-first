package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//LCM
public class N5347 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine());
            long numberA = Long.parseLong(st.nextToken());
            long numberB = Long.parseLong(st.nextToken());

            bw.write(getLCM(numberA, numberB) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    //최대 공약수 구하기(재귀호출)
    long getGCD(long numberA, long numberB){
        if(numberB == 0){
            return numberA;
        }else{
            return getGCD(numberB, numberA % numberB);
        }
    }

    //최소 공배수 구하기(최대 공약수 이용)
    long getLCM(long numberA, long numberB){
        return numberA * numberB / getGCD(numberA, numberB);
    }

    public static void main(String[] args) throws IOException{
        new N5347().solution();
    }
}
