package BaekJoon;

import java.io.*;

//줄 세우기
public class N11536{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [] nameArray = new String[testCase];
        int sum = 0;    //오름/내림 차순을 판달 할 변수

        for(int i = 0; i < testCase; i++){
            nameArray[i] = br.readLine();
        }

        br.close();

        for(int i = 0; i < testCase -1; i++){   //배열의 연속한 두 변수를 비교하기 위해 반복 범위를 줄임
            if(nameArray[i].compareTo(nameArray[i+1]) > 0){ //앞,뒤 데이터 비교 결과 양수라면, 앞의 데이터가 크다.
                sum++;  //compareTo() 메서드의 반환값은 아스키코드의 크기 차이를 반환하여 양,음수가 일정하지 않기에 1씩 증가하는 로직으로 짬
            }else if(nameArray[i].compareTo(nameArray[i+1]) < 0) {  //음수라면, 뒤의 데이터가 큰것
                sum--;
            }
        }

        if(sum == testCase-1){
            bw.write("DECREASING");
        }else if(sum == 1-testCase){
            bw.write("INCREASING");
        }else{
            bw.write("NEITHER");
        }

        bw.flush();
        bw.close();
    }

    //by myc
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int testCase = Integer.parseInt(br.readLine());
//        String [] nameArray = new String[testCase];
//
//        for(int i = 0; i < testCase; i++){
//            nameArray[i] = br.readLine();
//        }
//
//        br.close();
//
//        int compareFlag = nameArray[0].compareTo(nameArray[1]);   //첫, 두번째 데이터를 비교한 플래그
//
//        for(int i = 0; i < testCase -1; i++){
//            if(nameArray[i].compareTo(nameArray[i+1]) * compareFlag < 0) {    //반복시 앞,뒤 데이터의 compareTo() 반환값 될때의 곱 결과가 다르게 나온다면 증/감이 섞인 것이므로 아무것도 아니다
                //양수 * 양수 = 양수, 음수 * 음수 = 양수 <== 이 특징을 이용
//                bw.write("NEITHER");
//                bw.flush();
//                return;
//            }
//        }
//
//        bw.write(compareFlag > 0 ? "DECREASING" : "INCREASING");
//
//        bw.flush();
//        bw.close();
//    }
}
