package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문자열
public class N1120 {
    public static void main(String[] args) throws IOException {
        //문자열 A의 앞,뒤에 단어를 붙혀 문자열 B와 길이를 맞춰 다른 문자의 개수를 구하는데에 꽂혔으나 그럴 필요가 없었다
        //A의 앞, 뒤에 붙혀 개수를 세는 것 보다 A를 B에 대조하면서 나온 문자열의 차이를 구해 최소 값을 출력하는 방식으로 풀었다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] inputArray = br.readLine().split(" ");    //0번지는 A, 1번지는 B
        List<Integer> minArray = new ArrayList<>(); //반복 후 다른 문자의 개수를 저장할 ArrayList

        if(inputArray[0].length() == inputArray[1].length()){   //문자열의 길이가 같은 경우
            int min = 0;
            for(int i = 0; i < inputArray[0].length(); i++){
                if(inputArray[0].charAt(i) != inputArray[1].charAt(i)){ //문자열의 해당 번지의 문자가 다르면 최소값 증가
                    min++;
                }
            }

            bw.write(min + "");

        }else{  //문자열의 길이가 다른 경우
            for(int i = 0; i <= inputArray[1].length() - inputArray[0].length(); i++){  //문자열 B와 비교하되 반복마다 한 문자 뒤의 문자를 비교
                int k = i;  //2중 for문 안에서 비교 글자를 맞추기 위한 변수 선언
                int temp = 0;   //다른 글자의 개수를 저장할 변수

                for(int j = 0; j <inputArray[0].length(); j++){
                    if(inputArray[0].charAt(j) != inputArray[1].charAt(k)){
                        temp++;
                    }
                    k++;
                }

                minArray.add(temp);
            }

            Collections.sort(minArray); //최소를 구하기 위해 정렬

            bw.write(minArray.get(0) + "");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
