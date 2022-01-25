package DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBDao {
	Connection conn;
	//Connection 타입의 참조변수 conn 을 선언
	
	public DBDao() {
		this.conn = new DBConn().getConn();
		//생성자를 통하여 클래스 변수로 선언한 conn에 DBConn클래스로 부터 객체를 생성하여 getConn()메서드를 호출한 리턴값을 저장한다.
		//getConn()으로 리턴받은 값에는 데이터베이스에 접근가능한 정보가 저장되어있고 이릍통하여 데이터베이스와 연동한다.
	}
	
	public DBVo login(String mid, String pwd) {
		//public 으로 전역에서 사용가능한 StudentVo 타입의 값을 반환하는 login()메서드를 선언하고, 매개변수로는 String 타입의 mid, paw를 받는다
		DBVo vo = null;
		//리턴하기 위한 StudentVo 타입의 참조변수 vo를 선언하고 초기값을 null로 지정한다.
		PreparedStatement ps = null;
		//PreparedStatement 타입의 참조변수를 선언하고 null값으로 초기화, PreparedStatement는 sql문을 실행하기 위한 기능을 가진다.
		ResultSet rs = null;
		//executeQuery로 DB에 명령하면 데이터를 ResultSet 객체로 돌려주기에 이를 저장하기위한 ResultSet타입의 참조변수를 선언하였다. 
		String sql = "select * from hr.student where mid=? and pwd=? ";
		//sql 문을 실행하기 위한 명령어를 String 타입의 sql 변수에 저장함
		try {	//예외가 발생할 만한 지점 시작
			ps = conn.prepareStatement(sql);
			//conn의 prepareStatement()메서드에 sql 명령어를 담아 준비함
			ps.setString(1, mid);
			ps.setString(2, pwd);
			//sql문의 첫번째 ?에 mid, 두번째 ?에 pwd로 입력하여 준다.
			
			rs = ps.executeQuery();
			//ResultSet 타입의 참조변수 rs에 ps의 executeQuery()메서드를 실행한 결과를 저장한다.
			//executeQuery()를 통해 sql 문이 데이터베이스에 전달되어 데이터베이스는 이를 실행 하고 얻은 데이터를 ResultSet 객체로 전달하여 준다.
			if(rs.next()) {	//rs에 값이 있다면
				vo = new DBVo();
				//멤버변수로 선언된 vo에 StudentVo() 객체를 생성하여 주소값을 저장한다.
				vo.setMid(rs.getString("mid"));
				vo.setIrum(rs.getString("irum"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setEmail(rs.getString("email"));
				vo.setPwd(rs.getString("pwd"));
				vo.setGrade(rs.getInt("grade"));
				//데이터베이스의 sql문 실행 결과로 얻은 데이터값들로 각각의 위치에 저장한다.
			}
		}catch(Exception ex) {
			ex.printStackTrace();	//예외 발생시 예외내용 출력
		}
		return vo;	//위의 과정으로 저장된 데이터들이 참조변수 vo에 저장되어 반환된다.
	}
}
