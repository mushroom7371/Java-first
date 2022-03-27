package BaekJoon;

import java.io.*;

//크로아티아 알베벳
public class N2941 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();

        int len = str.length();
        int count = 0;
        char ch;    //기준 문자를 저장할 기본형 변수

        for(int i = 0; i < len; i++){   //문자열의 길이만큼 1씩 증가하면서 반복
            ch = str.charAt(i); //각 자리의 문자를 기준으로 세팅

            if(ch == 'c' && i < len - 1){   //문자가 c일 경우, c로 끝나는 문자가 주어질때 범위 오류가 생기므로 조건 부여
                if(str.charAt(i + 1)  == '=' || str.charAt(i + 1) == '-'){  //다음 문자가 =,-라면 크로아티아 알파벳이다
                    i++;    //카운트 증가
                }
            }else if(ch == 'd' && i < len - 1){ //위의 조건과 상동
                if(str.charAt(i + 1)  == '-'){
                    i++;
                }else if(str.charAt(i + 1) == 'z' && i < len - 2){  //크로아티아 문자가 dž일 경우 dz=로 변경 되므로 조건 추가
                    if(str.charAt(i + 2) == '='){
                        i += 2;
                    }
                }
            }else if((ch == 'l' || ch == 'n') && i < len - 1) { //위의 조건과 상동
                if(str.charAt(i + 1) == 'j') {
                    i++;
                }
            }else if((ch == 's' || ch == 'z') && i < len - 1) { //마찬가지
                if(str.charAt(i + 1) == '=') {
                    i++;
                }
            }

            count++;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
