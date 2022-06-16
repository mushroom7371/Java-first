package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//암기왕
public class N2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Set<Integer> realSeeNumber = new HashSet<>();   //연종이가 실제로 본 숫자를 저장할 HashSet

        for(int i = 0; i < testCase; i++){
            int numberOfm1 = Integer.parseInt(br.readLine());
            int [] inputNumber = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //연종이가 실제로 본 숫자를 int 배열에 담아두고
            
            for(int j = 0; j < numberOfm1; j++){    //HashSet에 저장
                realSeeNumber.add(inputNumber[j]);
            }

            int numberOfm2 = Integer.parseInt(br.readLine());
            int [] questionNumber = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //물어볼 숫자를 int 배열에 담아서
            
            for(int k = 0; k < numberOfm2; k++){    //실제로 본 숫자가 담긴 HashSet에 물어볼 숫자가 존재한다면 1출력 아니면 0출력
                if(realSeeNumber.contains(questionNumber[k])){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }

            realSeeNumber.clear();  //재사용을 위해 클리어
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
