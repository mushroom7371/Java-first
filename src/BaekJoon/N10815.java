package BaekJoon;

import java.io.*;
import java.util.*;

//숫자 카드
public class N10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSangGunsCard = Integer.parseInt(br.readLine()); //상근이 카드 개수
        int [] sangGunsCard = new int[numberOfSangGunsCard];    //상근이의 숫자 카드들이 담길 배열
        String [] cardStrArrToSplit = br.readLine().split(" "); //카드에 쓰여진 숫자를 나눠 String 배열에 저장

        for(int i = 0; i < numberOfSangGunsCard; i++){  //상근이 숫자 카드를 int 배열에 저장
            sangGunsCard[i] = Integer.parseInt(cardStrArrToSplit[i]);
        }

        int numberOfCardToCompare = Integer.parseInt(br.readLine());    //비교할 카드 개수
        int [] cardForCompare = new int[numberOfCardToCompare]; //비교할 숫자 카드가 담길 배열 ==> 아래의 HashMap은 순서를 보장하기 않기에 순서유지용으로 선언
        Map<Integer, Boolean> cardForCompareHashMap = new HashMap<>();  //동일한 키값(숫자)이 있는지 확인하기 위해 선언한 HashMap(비교할 숫자 카드를 담을 예정)
        cardStrArrToSplit = br.readLine().split(" ");

        for(int i = 0; i < numberOfCardToCompare; i++){ //비교 카드를 int배열에 순차적으로 저장하고, HashMap에 같은 비교 카드를 저장. 초기 value값 설정
            cardForCompare[i] = Integer.parseInt(cardStrArrToSplit[i]);
            cardForCompareHashMap.put(cardForCompare[i], false);
        }

        for(int i = 0; i < numberOfSangGunsCard; i++){  //상근이 카드 숫자만큼 반복
            if(cardForCompareHashMap.containsKey(sangGunsCard[i])){ //상근이 카드 숫자가 비교 카드에 키값으로 있다면
                cardForCompareHashMap.put(sangGunsCard[i], true);   //해당 키값의 value를 ture로 변경(키값은 중복이 안되므로 value 덮어쓰기 가능)
            }
        }

        for(int i = 0; i < numberOfCardToCompare; i++){
            if(cardForCompareHashMap.get(cardForCompare[i]).booleanValue() == true){    //동일 숫자 카드가 있으면 1, 없으면 0으로 데이터 변경 후 버퍼에 기록
                cardForCompare[i] = 1;
            }else {
                cardForCompare[i] = 0;
            }

            bw.write(cardForCompare[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    //회사의 알고리즘 고수 myc 매니저의 참고용 코드
    //배열을 HashMap처럼 사용할 수 있다함
    /*static String yc() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20000010];
        int[] sk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //bufferedReader로 입력받은 문자열을 숫자로 바꾸기 위한 스트림 사용법


        Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

        //100 & 001 = 000 = 1 0     ==> 홀수 짝수는 비트연산을 통해 확인 할수 있다. 홀짝의 여부는 왼쪽의 0과 1로 판단하기 때문
        if(num & 1) { }

        for(int i : sk) {
            array[i + 10000000] = 1;
        }

        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        for(int i : num) {
            sb.append(array[i + 10000000] == 1 ? 1 : 0).append(' ');
        }

        return sb.toString();
    }*/
}
