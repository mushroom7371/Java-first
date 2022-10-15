package BaekJoon;

import java.io.*;

//나는 친구가 적다 (Small)
public class N16171 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputStr = br.readLine();    //입력 문자열
        String targetStr = br.readLine();   //찾을 문자열
        String withoutNumberStr = "";   //숫자를 제거한 입력문자열

        for(int i = 0; i < inputStr.length(); i++){
            if(inputStr.charAt(i) >= 'A'){  //입력문자열에서 i번째 인덱스의 문자가 알파벳이라면
                withoutNumberStr += inputStr.charAt(i);
            }
        }

        if(withoutNumberStr.contains(targetStr)){   //숫자를 제거한 문자열이 찾을 문자열을 포함한다면
            bw.write("1");
        }else{
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N16171().solution();
    }
}
