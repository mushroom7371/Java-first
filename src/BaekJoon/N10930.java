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
            MessageDigest sh = MessageDigest.getInstance("SHA-256");    //자바 기본 클래스인 MessageDigest를 사용, getInstance()메서드에 암호 해쉬 알고리즘 종류를 명시해준다.
            sh.update(str.getBytes());
            byte byteData[] = sh.digest();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < byteData.length ; i++){
                sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
            }
            SHA = sb.toString();
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            SHA = null;
        }
        return SHA;

    }
}
