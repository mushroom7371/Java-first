package BaekJoon;

import java.io.*;

//그룹 단어 체커
public class N1316 {
    //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //그룹 단어 체크 메서드를 따로 빼두었기에 객체 생성 없이 사용 하도록 static으로 선언

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nNum = Integer.parseInt(br.readLine()); //테스트 케이스 갯수
        int count = 0;  //그룹 단어 갯수

        for(int i = 0; i < nNum; i++){  //테스트 케이스 만큼 반복
            if(isGroup() == true){  //그룹 단어가 맞다면
                count++;    //갯수를 증가 시킨다
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    public static boolean isGroup() throws IOException{ //main에서 바로 사용할 예정으로 static으로 메서드를 선언
        String str = br.readLine(); //입력 받은 단어를 저장
        boolean [] groupCheck = new boolean[26];    //소문자 알파벳, 중복되지 않는 조건을 통해 알파벳 갯수만큼 논리형 변수를 담을 배열 생성
        int prev = 0;   //이전 문자

        for(int i = 0; i < str.length(); i++){  //주어진 문자열의 길이만큼 반복
            int current = str.charAt(i);    //현재 문자를 문자열의 해당 번지의 문자로 설정

            if(prev != current){    //이전 문자가 현재 문자랑 다르다면(같다면 그룹 문자의 가능성이 있으므로 상정할 필요 없다)
                if(groupCheck[current - 'a'] == false){ //해당 알파벳 위치의 데이터가 false(이전에 나온 문자가 아니)라면
                    groupCheck[current - 'a'] = true;   //true(최소 한번 나온 문자)로 변경하여 주고
                    prev = current; //반복시 기준이 되도록 이전 문자를 현재 문자로 바꿔준다.
                }else{  //해당 알파벳 위치의 데이터가 true(연속 되지는 않았지만 기존에 나온 문자)라면
                    return false;   //그룹 단어가 아니기에 false를 반환한다.
                }
            }

        }

        return true;    //위의 판단 로직에 해당 되지 않는다면 해당 단어는 그룹 단어이다.
    }

}
