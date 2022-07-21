package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//막대기
public class N1094 {
    public static void main(String[] args) throws IOException{
        //더 나은 코드가 없을까 찾아보던 중 nahwasa.com 에서 풀이를 보고 코드를 짜봤다
        //기본 골자는 64, 32, 16, ... , 1 의 숫자를 한개씩 사용해서 막대기의 길이를 표현하는 것이다.
        //그러므로 막대기의 길이를 2진법으로 바꾼 후 비트가 1인 개수를 세면 된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetLength = Integer.parseInt(br.readLine());
        String binaryString = Integer.toBinaryString(targetLength);
        int count = 0;

        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                count++;
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }


//    public static void main(String[] args) throws IOException {
//        //생각보다 코드가 많이 지저분하다... 다른 사람들은 코드도 짧고 간단하던데 조언좀 들어야 될거 같다
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int stickLength = 64;
//        int targetLength = Integer.parseInt(br.readLine());
//        List<Integer> stickList = new ArrayList<>();
//
//        if(stickLength == targetLength){    //초기 막대기 길이와 타겟 막대기 길이가 같으면 1출력
//            bw.write(1 + "");
//        }else{
//            while(true){    //반복횟수를 모르기 때문에 while로 반복
//                int stickLengthSum = 0; //막대기 길이 합
//                stickLength /= 2;   //막대기 길이를 2등분 하고
//
//                if(stickLength > targetLength){ //2등분 한 막대기 길이가 타겟 길이보다 크면
//                    stickList.add(stickLength); //나눈 막대기 한개만 저장
//                }else if(stickLength == 0){ //마지막 반복때 막대기길이가 0이되면 나눠진 막대기가 담긴 list에 담기지 않게 조건을 둠...
//
//                }else{  //2등분한 막대기가 타겟 길이보다 작으면 나눈 막대기 2개 저장
//                    stickList.add(stickLength);
//                    stickList.add(stickLength);
//                }
//
//                for(int i = 0; i < stickList.size(); i++){  //나눈 막대기들의 길이를 전부 더함
//                    stickLengthSum += stickList.get(i);
//                }
//
//                if(stickLengthSum == targetLength){ //막대기 길이가 타겟길이와 일치하면 막대기들이 담긴 list의 갯수를 출력
//                    bw.write(stickList.size() + "");
//                    break;
//                }else if(stickLengthSum - stickList.get(stickList.size() - 1) > targetLength){  //막대기 합에서 가장 마지막 막대기를 빼고 난 후의 길이가 타겟 길이보다 크면 막대기 두개를 뺌
//                    stickList.remove(stickList.size() - 1);
//                    stickList.remove(stickList.size() - 1);
//                }else{
//                    stickList.remove(stickList.size() - 1);
//                }
//
//            }
//        }
//
//        br.close();
//        bw.flush();
//        bw.close();
//
//    }
}
