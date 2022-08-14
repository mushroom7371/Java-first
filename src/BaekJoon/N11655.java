package BaekJoon;

import java.io.*;

//ROT13
public class N11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String beforeString = br.readLine();

        for(int i = 0; i < beforeString.length(); i++){ //주어진 문자열의 길이만큼 반복
            char tempChar = beforeString.charAt(i); //i번지의 문자

            if(tempChar >= 'a' && tempChar <= 'z'){ //소문자라면
                tempChar += 13; //13번째 뒤의 문자로 설정

                if(tempChar > 'z'){ //13번째 뒤의 문자가 소문자의 범위를 벗어나면 재조정
                    int tempInt = tempChar - 'z';   //char타입은 아스키코드로 되어있기에 z만큼 빼준 임시 코드를 구하고
                    tempChar = 'a' - 1; //소문자를 재 세팅한 후
                    tempChar += tempInt;    //위에서 구한 코드값을 더해준다.
                }

            }else if(tempChar >= 'A' && tempChar <= 'Z'){
                tempChar += 13;

                if(tempChar > 'Z'){
                    int tempInt = tempChar - 'Z';
                    tempChar = 'A' - 1;
                    tempChar += tempInt;
                }
            }

            bw.write(tempChar);

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
