package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

//시리얼 번호
public class N1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String [] serialArray = new String[testCase];

        for(int i = 0; i < testCase; i++){
            serialArray[i] = br.readLine();
        }

        Arrays.sort(serialArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {  //compare() 메서드를 오버라이딩 하여 조건에 맞도록 정렬을 실시
                if(o1.length() < o2.length()){  //길이가 짧은 문자열이 앞에 오도록
                    return -1;
                } else if (o1.length() == o2.length()) {    //문자열의 길이가 같을 때
                    if(numberSum(o1) == numberSum(o2)){ //아래 선언한 메서드를 통해 숫자들의 합을 구하고 합이 같으면 사전순으로
                        return o1.compareTo(o2);
                    }else{  //합이 다르다면 작은 숫자가 먼저 오도록
                        return Integer.compare(numberSum(o1), numberSum(o2));
                    }
                }else{
                    return 1;
                }
            }
        });

        for(int i = 0; i < serialArray.length; i++){
            bw.write(serialArray[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    static int numberSum(String serial){
        int sum = 0;

        for(int i = 0; i < serial.length(); i++){   //문자열의 해당 번지의 문자가 숫자라면 int형으로 바꿔서 sum에 저장
            if(serial.charAt(i) >= '0' && serial.charAt(i) <= '9'){
                sum += serial.charAt(i) - '0';
            }
        }

        return sum;
    }
}
