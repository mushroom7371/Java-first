package BaekJoon;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//SHA-256
public class N10930 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        br.close();
        bw.write(SHA256(s));
        bw.flush();
        bw.close();

    }

    public static String SHA256(String str){
        String SHA = "";
        try{
            MessageDigest sh = MessageDigest.getInstance("SHA-256");    //자바 기본 클래스인 MessageDigest를 사용, getInstance()메서드의 인자값으로 암호 해쉬 알고리즘 종류를 명시해준다.
            sh.update(str.getBytes());  //문자열을 바이트코드로 인코딩 해주고(인자를 넘기지 않으면 charset으로 인코딩), update()가 호출 될때 마다 객체내에 저장된 digest 값이 갱신됨
            byte byteData[] = sh.digest();  //byte 배열 타입 참조변수가 digest()를 통하여 값을 가져온 데이터를 가리키도록 한다.
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < byteData.length ; i++){
                sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));   //한개의 문자에 대한 내용을 오버라이딩한 toString()통하여 암호화 하여 StringBuffer에 저장한다.
            }
            SHA = sb.toString();
        }catch(NoSuchAlgorithmException e){ //예외 처리
            e.printStackTrace();
            SHA = null;
        }
        return SHA;

    }
}
