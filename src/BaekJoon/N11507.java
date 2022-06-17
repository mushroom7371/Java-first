package BaekJoon;

import java.io.*;

//카드셋트
public class N11507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String cardInfo = br.readLine();
        String [] cardArray = new String[cardInfo.length()/3];
        int startIndex = 0;

        for(int i = 0; i < cardInfo.length()/3; i++){
            cardArray[i] = cardInfo.substring(startIndex, startIndex + 3);
            startIndex += 3;
        }


    }
}
