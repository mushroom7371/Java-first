package BaekJoon;

import java.io.*;

//농구 경기
public class N1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] alphabetCountArray = new int[26];    //주어진 성들의 첫번째 문자의 갯수를 저장할 변수 
        int testCase = Integer.parseInt(br.readLine());
        int max = 0;    //5회 이상인 값을 확인 할 변수

        for(int i = 0; i < testCase; i++){
            String lastName = br.readLine();
            int temp = lastName.charAt(0) - 'a';    //성의 첫번째 문자를 숫자로 변환하여
            alphabetCountArray[temp]++; //해당 알파벳 번지에 카운트를 증가

            if(max < alphabetCountArray[temp]){ //max값 구하기
                max = alphabetCountArray[temp];
            }
        }

        if(max < 5){    //같은 문자로 시작하는 성이 5보다 적으면
            bw.write("PREDAJA");
        }else{
            for(int i = 0; i < alphabetCountArray.length; i++){ //크면 알파벳 순서로 해당 성의 첫 문자를 기록
                if(alphabetCountArray[i] > 4){
                    bw.write((char)(i+'a'));
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
