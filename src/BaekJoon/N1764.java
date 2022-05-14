package BaekJoon;

import java.io.*;
import java.util.*;

//듣보잡
public class N1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] personStrArr = br.readLine().split(" ");
        int numberOfNoHearPerson = Integer.parseInt(personStrArr[0]);   //듣도 못한 사람수
        int numberOfNoSeePerson = Integer.parseInt(personStrArr[1]);    //보도 못한 사람수
        Set<String> noHearPsersonSet = new HashSet<>(); //보도 못한 사람들이 담길 HashSet
        List<String> noHearAndNoSeePerson = new ArrayList<>();  //듣도 보도 못한 사람들이 담길 ArrayList
        String noSeePserson;    //보도 못한 사람 문자열을 가리킬 참조변수

        for(int i = 0; i < numberOfNoHearPerson; i++){  //듣도 못한 사람들을 담는다
            noHearPsersonSet.add(br.readLine());
        }

        for(int i = 0; i < numberOfNoSeePerson; i++){   //보도 못한 사람들만큼 반복하는데
            noSeePserson = br.readLine();

            if(noHearPsersonSet.contains(noSeePserson)){    //듣보 못한 사람들이 담긴 HashSet에 담긴 데이터가 보도 못한 사람과 같은 사람(같은 객체) 가 있는지 판단해서
                noHearAndNoSeePerson.add(noSeePserson); //있다면 듣보잡이므로 ArrayList에 추가한다.
            }
        }

        Collections.sort(noHearAndNoSeePerson); //정렬하고
        bw.write(noHearAndNoSeePerson.size() + "" + "\n");  //듣보잡 인원을 버퍼에 기록

        for(int i = 0; i < noHearAndNoSeePerson.size(); i++){   //듣보잡들을 기록
            bw.write(noHearAndNoSeePerson.get(i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
