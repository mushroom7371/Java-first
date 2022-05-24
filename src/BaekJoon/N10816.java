package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//숫자 카드 2
public class N10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int numberOfSanggeunsCards = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] sangGeunCards = new int[numberOfSanggeunsCards];

        for(int i = 0; i < numberOfSanggeunsCards; i++){
            sangGeunCards[i] = Integer.parseInt(st.nextToken());
        }

        int numberOfTargetCards = Integer.parseInt(br.readLine());
        int [] targetCards = new int[numberOfTargetCards];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numberOfTargetCards; i++){
            targetCards[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < numberOfTargetCards; i++){
            int count = 0;
            for(int j = 0; j < numberOfSanggeunsCards; j++){
                if(targetCards[i] == sangGeunCards[j]){
                    count++;
                }
            }
            targetCards[i] = count;
        }

        for(int i = 0; i < numberOfTargetCards; i++){
            bw.write(targetCards[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
