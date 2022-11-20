package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//대표값2
public class N2587 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> numberList = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < 5; i++){
            int number = Integer.parseInt(br.readLine());
            sum += number;
            numberList.add(number);
        }

        Collections.sort(numberList);

        bw.write(sum/5 + "\n" + numberList.get(2));

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2587().solution();
    }
}
