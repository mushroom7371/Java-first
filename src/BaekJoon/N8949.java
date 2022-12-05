package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//대충 더해
public class N8949 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numberA = Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray();  //첫번재 숫자를 자리수마다 잘라 배열에 저장
        int[] numberB = Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray();  //뒤와 동일
        StringBuilder result = new StringBuilder(); //정답을 담을 StringBuilder
        int index = numberA.length - numberB.length;    //숫자의 길이 차이를 저장할 변수

        if(index >= 0){ //첫번째 숫자가 크다면
            for(int i = 0; i < index; i++){ //차이 만큼 저장
                result.append(numberA[i]);
            }
            for(int i = 0; i < numberB.length; i++){    //그 이후의 숫자는 더해서 저장 배열의 길이가 다르기에 인덱스가 i+index 가 된다.
                result.append(numberA[i + index] + numberB[i]);
            }
        }else{  //두번재 숫자가 크다면
            index *= -1;    //인덱스가 음수므로 -1을 곱해줌
            for(int i = 0; i < index; i++){
                result.append(numberB[i]);
            }
            for(int i = 0; i < numberA.length; i++){
                result.append(numberB[i + index] + numberA[i]);
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N8949().solution();
    }
}
