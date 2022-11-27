package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//홀수
public class N2576 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> numberList = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < 7; i++){
            int number = Integer.parseInt(br.readLine());

            if(number % 2 == 1){
                numberList.add(number);
            }
        }

        if(numberList.size() == 0){
            bw.write("-1");
        }else{
            Collections.sort(numberList);

            for(int i = 0; i < numberList.size(); i++){
                sum += numberList.get(i);
            }

            bw.write(sum +"\n" + numberList.get(0));
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2576().solution();
    }
}
