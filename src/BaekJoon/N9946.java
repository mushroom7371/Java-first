package BaekJoon;

import java.io.*;

//단어 퍼즐
public class N9946 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String beforeString = "";   //준하의 완성 단어
        String afterString = "";    //회수 한 알파벳
        int testCase = 0;

        while(!(beforeString = br.readLine()).equals("END") && !(afterString = br.readLine()).equals("END")){   //입력이 END로 들어오면 반복 종료
            testCase++; //각 시행 횟수 증가
            int[] beforeAlphabetArray = new int[26];    //첫번째 입력의 알파벳 개수를 담을 배열
            int[] afterAlphabetArray = new int[26]; //두번째 입력의 알파벳 개수를 담을 배열
            boolean sameFlag = true;    //같은 알파벳을 가졌는지 판단할 논리 변수

            for(int i = 0; i < beforeString.length(); i++){ //첫번째 입력의 길이만큼 반복
                int index = beforeString.charAt(i) - 'a';   //소문자 a를 빼주어 인덱스 설정 0~25가 됨
                beforeAlphabetArray[index]++;   //해당 알파벳 수 증가
            }

            for(int i = 0; i < afterString.length(); i++){
                int index = afterString.charAt(i) - 'a';
                afterAlphabetArray[index]++;
            }

            for(int i = 0 ; i < 26; i++){   //알파벳 배열의 크기만큼 반복
                if(afterAlphabetArray[i] != beforeAlphabetArray[i]){    //알파벳의 개수가 서로 다르다면
                    sameFlag = false;   //다른 단어의 조합이므로 플래그값 false 및 반복 종료
                    break;
                }
            }

            if(sameFlag){
                bw.write("Case " + testCase + ": same\n");
            }else {
                bw.write("Case " + testCase + ": different\n");
            }
        }

        br.close();
        bw.flush();
        bw.flush();

    }

    public static void main(String[] args) throws IOException{
        new N9946().solution();
    }
}
