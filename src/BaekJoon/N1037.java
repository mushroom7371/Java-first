package BaekJoon;

import java.io.*;
import java.util.Arrays;

//약수
public class N1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfDivisor = Integer.parseInt(br.readLine());  //주어진 약수의 갯수
        int [] divisorArr = new int[numberOfDivisor];   //약수의 갯수만큼의 크기를 가진 배열 선언(정렬용)
        String [] arrForSplit;  //입력받은 문자를 나눠 숫자를 담을 배열 선언

        if(numberOfDivisor == 1){   //약수의 갯수가 한개라면 split할 필요 없이 배열에 저장
            divisorArr[0] = Integer.parseInt(br.readLine());
        }else{  //아니라면 공백을 기준으로 나눠 int타입으로 변환 및 저장
            arrForSplit = br.readLine().split(" ");

            for(int i = 0; i < numberOfDivisor; i++){
                divisorArr[i] = Integer.parseInt(arrForSplit[i]);
            }
        }

        br.close();

        Arrays.sort(divisorArr);    //약수를 정렬해 최대값과 최소값을 곱하면 원래의 수가 나오기 때문에 정렬

        if(divisorArr.length == 1){ //약수의 개수가 1개라면 해당 약수를 제곱하면 된다.
            bw.write(divisorArr[0] * divisorArr[0] + "" + "\n");
        }else{  //아니라면 정렬의 결과로 최소값인 0번지 데이터와 최대값인 마지막 데이터를 곱하여 준다.
            bw.write(divisorArr[0] * divisorArr[divisorArr.length - 1] + "" + "\n");
        }

        bw.flush();
        bw.close();

    }
}
