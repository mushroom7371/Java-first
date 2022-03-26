package BaekJoon;

import java.io.*;

//알파벳 찾기
public class N10809 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();
        int [] index = new int[26]; //알파벳 소문자 갯수만큼의 크기를 가지는 배열 생성
        char character; //해당 자리의 문자를 저장할 char 타입 기본형 변수 선언

        for(int i = 0; i < index.length; i++){  //모든 번지의 데이터 -1로 초기화
            index[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            character = str.charAt(i);  //해당 자리의 문자를 저장

            if(index[character - 'a'] == -1) { //해당 알파벳의 자리의 번지에
                index[character - 'a'] = i; //i를 저장함
            }
        }

        for(int val : index){   //buffer에 작성
            bw.write(val + " ");
        }

        bw.flush();
        bw.close();
    }
}
