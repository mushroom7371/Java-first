package BaekJoon;

import java.io.*;

//명령 프롬프트
public class N1032 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase =  Integer.parseInt(br.readLine());
        StringBuilder fileName = new StringBuilder(br.readLine());  //첫번째 입력 문자열

        if(testCase > 1){   //입력이 2줄 이상일 경우(아니면 그대로 출력)
            for(int i = 1; i < testCase; i++){  //두번째 입력부터 testCase 만큼 반복
                StringBuilder tempName = new StringBuilder(br.readLine());  //비교 입력 문자열

                for(int j = 0; j < tempName.length(); j++){ //비교 문자열의 길이만큼 반복
                     if(fileName.charAt(j) != tempName.charAt(j)){  //원본 문자열의 문자와 다르다면
                         fileName.setCharAt(j, '?');    //해당 문자를 '?'로 치환
                     }
                }
            }
        }

        System.out.println(fileName);   //'?'로 치환된 문자열을 출력
        br.close();

    }

    public static void main(String[] args) throws IOException{
        new N1032().solution();
    }
}
