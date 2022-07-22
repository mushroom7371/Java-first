package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//숫자놀이
public class N1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] rangeOfNumberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = rangeOfNumberArray[0];
        int end = rangeOfNumberArray[1];
        List<String> numberStringList = new ArrayList<>();
        List<String> resultNumberList = new ArrayList<>();
        int count = 0;

        for(int i = start; i <= end; i++){
            if(i < 10){
                numberStringList.add(integerToString(i));
            }else{
                numberStringList.add(integerToString(i/10) + " " + integerToString(i%10));
            }
        }

        Collections.sort(numberStringList);

        for(int i = 0; i < numberStringList.size(); i++){
            String [] tempArray = numberStringList.get(i).split(" ");
            String tempNumber = "";

            if(tempArray.length == 1){
                tempNumber = stringToInteger(tempArray[0]);
            }else{
                tempNumber = stringToInteger(tempArray[0]) + stringToInteger(tempArray[1]);
            }

            resultNumberList.add(tempNumber);
        }

        for(int i = 0; i < resultNumberList.size(); i++){
            count++;

            if(count < 10){
                bw.write(resultNumberList.get(i) + " ");
            }else{
                bw.write(resultNumberList.get(i) + "\n");
                count = 0;
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    static String integerToString(int number) {
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

    static String stringToInteger(String number) {
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
