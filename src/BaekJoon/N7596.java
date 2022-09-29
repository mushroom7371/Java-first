package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//MP3 Songs
public class N7596 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        List<String> songList = new ArrayList<>();  //노래를 담을 list
        int listCount = 0;  //리스트의 수

        while(true){    //입력이 언제 끝날지 모르므로 항상 반복, 조건은 하위에 작성
            input = br.readLine();

            if(input.equals("0")){  //입력이 0이라면 
                Collections.sort(songList); //리스트 정렬

                bw.write(listCount+1 + "\n");   //리스트수 증가 후 기록
                for (String s : songList) {   //리스트 버퍼에 기록
                    bw.write(s + "\n");
                }

                break;  //while 종료
            }

            if(input.charAt(0) < 65){   //입력의 첫번째 문자가 숫자라면
                if(songList.size() > 0){    //리스트에 노래가 담겨 있다면
                    listCount++;    //리스트 수 증가
                    Collections.sort(songList); //리스트 정렬

                    bw.write(listCount + "\n"); //리스트 수 기록
                    for (String s : songList) {   //리스트 기록
                        bw.write(s + "\n");
                    }
                    songList.clear();   //리스트 초기화
                }
            }else{
                songList.add(input);    //입력이 숫자가 아니면, 노래를 리스트에 추가
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N7596().solution();
    }
}
