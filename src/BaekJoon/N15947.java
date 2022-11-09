package BaekJoon;

import java.io.*;

//아기 석환 뚜루루 뚜루
public class N15947 {
    //처음엔 주석처리 된 코드로 풀었으나 시간 초과됨. 아마 while문 안의 for문에서 turu인 단어에 ru를 추가하는 로직 때문인듯 하여 카운팅을 통한 로직으로 바꿈
    //String 은 +를 한다고 추가되는 것이 아니라 객체를 새로 생성하기에 생긴 문제인 것으로 예상 됨. 그래서 StringBUilder로 추가하는 코드도 추가함
    //다시 보니 처음 로직 자체가 잘못 된 듯
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String song = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan"; //사실 하드코딩이라 배열 선언하면서 넣어 두는게 더 빠를 것임
        String[] songArray = song.split(" ");
        int targetIndex = Integer.parseInt(br.readLine());  //찾을 단어의 순서
        int recurringCount = targetIndex/songArray.length;  //찾을 단어의 순서가 노래의 문자 개수보다 많으면 노래를 다시 부르기에 반복 카운팅을 설정함
        targetIndex--;  //배열의 인덱스는 0번지부터 시작하므로 1 감소 시킴
        int realIndex = targetIndex % songArray.length; //실제로 찾을 인덱스는 나머지 연산의 결과가 된다.

        if(!songArray[realIndex].startsWith("tu")){ //"tu"로 시작하지 않으면 그냥 버퍼에 기록
            bw.write(songArray[realIndex]);
        }else{
            int k = (songArray[realIndex].length() - 2)/2;  //"ru"의 개수가 필요하기에 "tu" 를 뺀 길이에서 "r" "u" 2글자라 2로 나눔
            k += recurringCount;    //반복 마다 "ru"가 추가되기에 반복 횟수를 더해줌
            if(k >= 5){ //"ru" 가 5번 이상 나온경우
                bw.write("tu+ru*" + k);
            }else{
                StringBuilder result = new StringBuilder(songArray[realIndex]); //StringBuilder를 쓴 이유는 맨 위에 있음 String의 불변성과 관련한 내용
                for(int i = 0; i < recurringCount; i++){
                    result.append("ru");
                }
                bw.write(String.valueOf(result));
            }
        }

//        while(recurringCount --> 0){
//            if(!songArray[realIndex].startsWith("tu")){
//                bw.write(songArray[realIndex]);
//                break;
//            }
//
//            for(int i = 0; i < songArray.length; i++){
//                if(songArray[i].startsWith("tu")){
//                    songArray[i] += "ru";
//                }
//            }
//        }
//
//        String result = songArray[realIndex];
//        int k = (result.length()-2)/2;
//
//        if(k >= 5){
//            bw.write("tu+ru*" + k);
//        }else{
//            bw.write(result);
//        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N15947().solution();
    }
}
