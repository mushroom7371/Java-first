package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//숫자 카드 2
public class N10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numberOfSanggeunsCards = Integer.parseInt(br.readLine());
        int [] cardTemp = new int[numberOfSanggeunsCards];
        Map<Integer, Integer> sangGeunCards = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int count = 1;

        for(int i = 0; i < numberOfSanggeunsCards; i++){
            cardTemp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cardTemp);

        for(int i = 0; i < numberOfSanggeunsCards - 1; i++){
            if(i < numberOfSanggeunsCards - 2){
                if(cardTemp[i] == cardTemp[i+1]){
                    count++;
                }else{
                    sangGeunCards.put(cardTemp[i], count);
                    count = 1;
                }
            }else{
                if(cardTemp[i] == cardTemp[numberOfSanggeunsCards -1]){
                    count++;
                    sangGeunCards.put(cardTemp[i], count);
                }else{
                    sangGeunCards.put(cardTemp[i], count);
                    sangGeunCards.put(cardTemp[numberOfSanggeunsCards -1], 0);
                }
            }
        }

        int numberOfTargetCards = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> targetCards = new HashMap<>();

        for(int i = 0; i < numberOfTargetCards; i++){
            int temp = Integer.parseInt(st.nextToken());
            targetCards.put(temp, 0);

            if(sangGeunCards.containsKey(temp)){
                targetCards.put(temp, sangGeunCards.get(temp));
            }

            bw.write(targetCards.get(temp) + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
