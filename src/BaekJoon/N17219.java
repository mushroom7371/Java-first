package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//비밀번호 찾기
public class N17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] testCase = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();    //테스트 케이스를 스트림을 이용해 형변환 후 int 배열에 저장
        int numberOfSite = testCase[0]; //사이트와 비밀번호가 적힌 입력 데이터의 수
        int numberOfSiteForFindPwd = testCase[1];   //비밀번호를 찾을 사이트의 수
        Map<String, String> siteAndPwd= new HashMap<>();    //사이트와 비밀번호를 key,value로 매칭하여 저장할 hashMap 생성

        for(int i = 0; i < numberOfSite; i++){
            String [] inputStr = br.readLine().split(" ");  //String 배열에 사이트명과 비밀번호를 나눠 담고
            siteAndPwd.put(inputStr[0], inputStr[1]);   //HashMap에 key, value로 저장
        }

        for(int i = 0; i < numberOfSiteForFindPwd; i++){    //비밀번호를 찾을 사이트 수 만큼 반복
            String site = br.readLine();
            if(siteAndPwd.containsKey(site)){   //HashMap에 비밀번호를 찾고 싶은 사이트가 있다면
                bw.write(siteAndPwd.get(site) + "\n");  //비밀번호를 버퍼에 기록
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
