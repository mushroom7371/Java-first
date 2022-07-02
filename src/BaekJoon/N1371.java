package BaekJoon;

import java.io.*;
import java.util.Scanner;

//가장 많은 글자
public class N1371 {
    public static void main(String[] args) throws IOException {
        //인텔리제이에서 eof가 안끝남 백준 사이트에 올려보면 풀림. BufferedReader로 짠 코드는 아무것도 없는 줄 다음에 단어가 나오면 아무것도 없는 줄에서 멈춰버림...
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int [] alphabetCountArray = new int[26];    //알파벳의 개수
        String input = "";

//        while((input = br.readLine()) != null && !input.isEmpty()){
//            sb.append(input.replaceAll("\\s", ""));
//        }

        while(sc.hasNextLine()){    //eof를 위한 조건, 입력이 더이상 들어오지 않으면 종료
            input = sc.nextLine();
            sb.append(input.replaceAll("\\s", "")); //공백을 지워주고 StringBuilder에 저장
        }

        for(int i = 0; i < sb.length(); i++){   //소문자를 숫자로 변환해서 해당 번지의 숫자를 카운트 => 해당 문자가 몇번 나왔는지 알 수 있다.
            int temp = sb.charAt(i) - 'a';
            alphabetCountArray[temp]++;
        }

        int max = 0;
        for(int i = 0; i < alphabetCountArray.length; i++){
            if(max < alphabetCountArray[i]) { //제일 많이 카운트 된 숫자를 max로 설정
                max = alphabetCountArray[i];
            }
        }

        for(int i = 0; i < alphabetCountArray.length; i++){ //가장 많이 나온 숫자를 버퍼에 기록
            if(alphabetCountArray[i] == max){
                bw.write((char)(i+'a'));
            }
        }

//        br.close();
        bw.flush();
        bw.close();

    }
}
