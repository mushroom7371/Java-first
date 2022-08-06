package BaekJoon;

import java.io.*;

//애너그램 만들기
public class N1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] charArrayA = new int[26];    //입력 문자열A의 알파벳 개수 확인용 배열
        int [] charArrayB = new int[26];    //입력 문자열B 확인용
        int count = 0;  //애너그램을 만드는데 필요한 제거 문자 개수
        String inputStringA = br.readLine();
        String inputStringB = br.readLine();

        for(int i = 0; i < inputStringA.length(); i++){ //문자열A의 알파벳 개수를 해당하는 배열에 저장
            charArrayA[inputStringA.charAt(i) - 'a']++;
        }

        for(int i = 0; i < inputStringB.length(); i++){ //문자열B의 알파벳 개수를 저장
            charArrayB[inputStringB.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){    //알파벳 개수가 담긴 배열의 크기가 26으로 동일하기에 26번 반복
            count += Math.abs(charArrayA[i] - charArrayB[i]);   //같은 알파벳 개수 차이를 count에 저장
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
