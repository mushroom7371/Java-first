package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//이름 궁합
public class N15312 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabetStroke = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};  //알파벳 획수에 대응하는 배열을 초기에 선언
        String nameA = br.readLine();   //첫번째 이름
        String nameB = br.readLine();   //두번째 이름
        List<Integer> nameToStroke = new ArrayList<>(); //이름을 획수로 바꿔 저장할 ArrayList

        for(int i = 0; i < nameA.length(); i++){    //이름 길이가 같기에 한번의 반복으로 획수를 번갈아가면서 저장
            nameToStroke.add(alphabetStroke[nameA.charAt(i) - 'A']);
            nameToStroke.add(alphabetStroke[nameB.charAt(i) - 'A']);
        }

        while(nameToStroke.size() != 2){    //궁합이 2자리가 될때까지 반복
            List<Integer> tempList = new ArrayList<>(); //임시 궁합을 저장할 ArrayList
            int tempNumber = 0; //계산 결과가 저장될 변수

            for(int i = 0; i < nameToStroke.size()-1; i++){ //앞의 획수와 뒤의 획수를 비교할 예정으로 길이-1 만큼 반복
                tempNumber = nameToStroke.get(i) + nameToStroke.get(i+1);
                tempList.add(tempNumber % 10);  //일의 자리만 저장
            }

            nameToStroke = tempList;    //참조 변수가 임시궁합을 가리키도록 설정
        }

        bw.write(nameToStroke.get(0) + "" + nameToStroke.get(1));

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N15312().solution();
    }
}
