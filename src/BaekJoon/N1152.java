package BaekJoon;

import java.io.*;

//단어의 갯수
public class N1152 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().trim();  //주어진 문자열에서 첫, 끝 단어에 공백이 올 수 있으므로 이를 제거 한다.
        String [] strArr = str.split(" ");  //공백을 기준으로 문자열을 나누고, 이 문자를 String 타입의 참조변수 strArr이 가리키는 배열에 순차적으로 저장한다.

        br.close();
        if(str.length() == 0){  //아무런 입력을 받지 않은 경우
            bw.write("0");  //주어진 단어는 0개가 된다.
        }else {
            bw.write(strArr.length + "");   //배열의 길이 만큼의 단어가 있지만, int 형식은 write()메서드에 그대로 사용 할 경우 아스키코드에 따른 문자가 출력 되므로 문자형으로 변환해야 된다.
        }
        bw.flush();
        bw.close();

    }
}
