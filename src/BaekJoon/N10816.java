package BaekJoon;

import java.io.*;
import java.util.*;

//숫자 카드 2
public class N10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numberOfSanggeunsCards = Integer.parseInt(br.readLine());   //상근이크 카드 개수
        int [] cardTemp = new int[numberOfSanggeunsCards];  //상근이 카드들이 담길 임시 배열
        Map<Integer, Integer> sangGeunCards = new HashMap<>();  //중복을 제거한 상근이 카드가 담길 hashMap
        st = new StringTokenizer(br.readLine());
        int count = 1;  //해당 숫자의 카드 개수를 카운팅할 변수

        for(int i = 0; i < numberOfSanggeunsCards; i++){    //임시 배열에 상근이의 숫자카드를 저장
            cardTemp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cardTemp);  //중복 카드를 카운팅 하기위해 정렬

        for(int i = 0; i < numberOfSanggeunsCards - 1; i++){    //배열의 길이 -1만큼 반복(i번지와 i+1번지를 비교할 것이므로 범위를 벗어나지 않도록 하기 위함)
            if(i < numberOfSanggeunsCards - 2){ //맨 마지막 데이터 전전 데이터 까지 구할때
                if(cardTemp[i] == cardTemp[i+1]){   //연속된 숫자카드가 같다면 카운트 증가
                    count++;
                }else{
                    sangGeunCards.put(cardTemp[i], count);  //같지 않으면 그때까지 중복된 카드 개수를 버퍼에 기록하고 카운팅을 1로 초기화
                    count = 1;
                }
            }else{  //맨 마지막 데이터와 그전 데이터라면
                if(cardTemp[i] == cardTemp[numberOfSanggeunsCards -1]){ //그 둘이 같으면 카운트 증가하고 버퍼에 기록
                    count++;
                    sangGeunCards.put(cardTemp[i], count);
                }else{  //그 둘이 다르다면 마지막 데이터는 한개이므로 1로 기록
                    sangGeunCards.put(cardTemp[i], count);
                    sangGeunCards.put(cardTemp[numberOfSanggeunsCards -1], 1);
                }
            }
        }

//        (간략화 소스 by myc)
//        위의 Arrays.sort() 부터 for문까지를 아래 소스로 바꾸면 참 쉽다.
//        for(int i : cardTemp) {
//            int cnt = sangGeunCards.containsKey(i) ? sangGeunCards.get(i) + 1 : 1;  //상근이 카드 배열에 해당 숫자 카드가 중복되면 카운트 증가, 중복되지 않으면 1개
//            sangGeunCards.put(i, cnt);  //상근이가 가진 해당 숫자카드의 value를 cnt로 설정
//
//            if(sangGeunCards.containsKey(i)) { 바로 위의 삼항 연산자 내용과 동일
//                sangGeunCards.put(i, sangGeunCards.get(i) + 1);
//            }
//             else {
//                 sangGeunCards.put(i, 1);
//            }
//        }

        int numberOfTargetCards = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> targetCards = new HashMap<>();    //주어진 타겟 숫자카드를 저장할 hashMap

        for(int i = 0; i < numberOfTargetCards; i++){
            int temp = Integer.parseInt(st.nextToken());
            targetCards.put(temp, 0);   //주어진 카드의 숫자를 key로, 초기 개수 0을 value로 설정

            if(sangGeunCards.containsKey(temp)){    //상근이 카드에 주어진 카드 숫자가 존재하면
                targetCards.put(temp, sangGeunCards.get(temp)); //해당 숫자카드를 key로, 중복 개수를 value로 설정
            }

            bw.write(targetCards.get(temp) + " ");

//            int result = sangGeunCards.containsKey(temp) ? sangGeunCards.get(temp) : 0;   위의 내용을 간략화 한 소스, 애초에 hashMap이니 처음부터 있으면 value값을, 없으면 0을 버퍼에 기록하면 쉽다.
//            bw.write(Integer.toString(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

//알고리즘 고수 myc 매니저님의 조언
//    int numberOfSanggeunsCards = Integer.parseInt(br.readLine());
//    int[] cardTemp = new int[20000001];   //주어질 카드 숫자의 범위만큼을 처음부터 배열로 생성해 둔다. -10,000,000 ~ 10,000,000이므로 0을 포함하여 크기 설정
//
//    s = new StringTokenizer(br.readLine());
//    while(st.hasMoreTokens()) {   //다음 토큰이 없을때 까지(End Of File)
//        cardTemp[Integer.parseInt(st.nextToken()) + 10000000]++;  //10000000을 더하여 음수값이 담길 공간을 마련한다
//    }
//
//    int printNumber = Integer.parseInt(br.readLine());
//    st = new StringTokenizer(br.readLine());
//    while(st.hasMoreTokens()) {
//        bw.write(cardTemp[Integer.parseInt(st.nextToken()) + 10000000] + " ");
//    }

//    ===============================================================================

//    int numberOfSanggeunsCards = Integer.parseInt(br.readLine());
//
//        Arrays.stream(br.readLine().split(" "))   //스트림을 사용하여 입력값을 바로 형변환 하여 저장한다.
//            .mapToInt(Integer::parseInt)
//                .forEach(N10816::plus);
//
//    int printNumber = Integer.parseInt(br.readLine());
//    st = new StringTokenizer(br.readLine());
//        while(st.hasMoreTokens()) {
//        bw.write(cardTemp[Integer.parseInt(st.nextToken()) + 10000000] + " ");
//    }




}

