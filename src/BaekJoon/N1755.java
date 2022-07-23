package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//숫자놀이
public class N1755 {
    public static void main(String[] args) throws IOException {
        //노가다 성이 짙은 방식으로 풀었다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] rangeOfNumberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = rangeOfNumberArray[0];
        int end = rangeOfNumberArray[1];
        List<String> numberStringList = new ArrayList<>();
        List<String> resultNumberList = new ArrayList<>();
        int count = 0;

        for(int i = start; i <= end; i++){  //start 숫자부터 end 숫자까지
            if(i < 10){ //한자리 수라면 numberStringList() 메서드를 통해 해당 int 숫자를 단어로 바꾼다
                numberStringList.add(integerToString(i));
            }else{  //2자리 수라면 공백을 기준으로 단어로 바꾼다
                numberStringList.add(integerToString(i/10) + " " + integerToString(i%10));
            }
        }

        Collections.sort(numberStringList); //정렬 후

        for(int i = 0; i < numberStringList.size(); i++){
            String [] tempArray = numberStringList.get(i).split(" ");   //공백을 기준으로 나눠 String 배열에 저장하고,
            String tempNumber = "";

            if(tempArray.length == 1){  //한자리 숫자라면
                tempNumber = stringToInteger(tempArray[0]);
            }else{  //두자리 숫자라면 stringToInteger()를 통해 두 숫자를 String타입으로 받고 이어 붙힘
                tempNumber = stringToInteger(tempArray[0]) + stringToInteger(tempArray[1]);
            }

            resultNumberList.add(tempNumber);
        }

        for(int i = 0; i < resultNumberList.size(); i++){
            count++;    //10개 마다 끊어서 출력 할 예정으로 반복마다 count를 증가 시키고

            if(count < 10){ //열번째 숫자가 아니라면 공백으로 이어붙힘
                bw.write(resultNumberList.get(i) + " ");
            }else{  //10번째 숫자라면 한 줄 넘김
                bw.write(resultNumberList.get(i) + "\n");
                count = 0;  //count는 다시 0으로 설정
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
    
    //static으로 선언하여 클래스가 메모리에 적재 될 때 생성되어 객체 없이 사용 가능함.
    static String integerToString(int number) { //int타입의 숫자를 영어 단어로 바꿀 메서드
        String result = "";

        switch (number){
            case 1 : result = "one";
                break;
            case 2 : result = "two";
                break;
            case 3 : result = "three";
                break;
            case 4 : result = "four";
                break;
            case 5 : result = "five";
                break;
            case 6 : result = "six";
                break;
            case 7 : result = "seven";
                break;
            case 8 : result = "eight";
                break;
            case 9 : result = "nine";
                break;
            case 0 : result = "zero";
                break;
        }

        return result;
    }

    static String stringToInteger(String number) {  //영어 단어로 된 숫자를 String 숫자로 바꿀 메서드
        String result = "";

        switch (number){
            case "one" : result = "1";
                break;
            case "two" : result = "2";
                break;
            case "three" : result = "3";
                break;
            case "four" : result = "4";
                break;
            case "five" : result = "5";
                break;
            case "six" : result = "6";
                break;
            case "seven" : result = "7";
                break;
            case "eight" : result = "8";
                break;
            case "nine" : result = "9";
                break;
            case "zero" : result = "0";
                break;
        }

        return result;
    }
}
