package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

//카우버거
public class N15720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] testCaseArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //버거, 사이드, 음료가 담길 배열의 크기를 저장할 배열
        int min = testCaseArray[0]; //할인을 위해 조합을 맞추려면 가장 적게 담긴 메뉴를 기준으로 해야되기에 선언
        int sum = 0;    //원 가격
        int discountSum = 0;    //할인된 가격

        for(int i = 0; i < testCaseArray.length; i++){  //가장 적게 담긴 메뉴의 배열 크기를 찾는다
            if(min >= testCaseArray[i]){
                min = testCaseArray[i];
            }
        }

        for(int i = 0; i < testCaseArray.length; i++){
            int [] priceArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Integer [] price = Arrays.stream(priceArray).boxed().toArray(Integer[]::new);   //역순으로 정렬하려다 보니 원시타입 배열이 필요해서 변환
            Arrays.sort(price, Collections.reverseOrder()); //금액을 내림차순으로 정렬

            if(price.length > min){ //해당 메뉴가 담긴 배열이 min값보다 크면
                for(int j = 0; j < min; j++){   //min값 까지는 할인을 적용한 가격으로 더하고
                    discountSum += price[j]*0.9;
                    sum += price[j];
                }
                for(int k = min; k < price.length; k++){    //그 이후의 가격은 할인이 적용되지 않은 금액으로 더함
                    discountSum += price[k];
                    sum += price[k];
                }
            }else{
                for(int j = 0; j < price.length; j++){  //배열의 크기가 min이라면 전부 할인된 금액으로 합산
                    discountSum += price[j]*0.9;
                    sum += price[j];
                }
            }
        }

        br.close();
        bw.write(sum + "\n" + discountSum);
        bw.flush();
        bw.close();

    }
}
