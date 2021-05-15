package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/*	오라클을 연결하고 최종적으로 Connection 객체를 반환하는 역활 */

public class DBConn {
	//데이터 베이스와 연동하기 위한 DBConn 클래스 선언
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "system";
	String pwd = "wnsghk6670";
	//데이터베이스에 접근하기 위해 필요한 정보들을 String 변수에 담았다
	Connection conn = null;
	//Connection 타입의 참조변수 conn을 선언하고 null 로 초기화

	public Connection getConn() {	//Connection 타입의 값을 리턴하는 getConn() 메서드 선언
		try {
			Class.forName(driver);
			//각각의 데이터베이스에 연결하기 위한 드라이버 로드. 클래스 변수에 경로를 미리 설정해 놓음
			//이로 인해 객체가 생성되고, DriverManager에 등록됨
			conn = DriverManager.getConnection(url, user, pwd);
			//DriverManager의 getConnection()를 통하여 Connection 객체를 생성하고 이 주소값을 참조변수 conn에 저장함
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}