package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/*	����Ŭ�� �����ϰ� ���������� Connection ��ü�� ��ȯ�ϴ� ��Ȱ */

public class DBConn {
	//������ ���̽��� �����ϱ� ���� DBConn Ŭ���� ����
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String user = "system";
	String pwd = "wnsghk6670";
	//�����ͺ��̽��� �����ϱ� ���� �ʿ��� �������� String ������ ��Ҵ�
	Connection conn = null;
	//Connection Ÿ���� �������� conn�� �����ϰ� null �� �ʱ�ȭ

	public Connection getConn() {	//Connection Ÿ���� ���� �����ϴ� getConn() �޼��� ����
		try {
			Class.forName(driver);
			//������ �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�. Ŭ���� ������ ��θ� �̸� ������ ����
			//�̷� ���� ��ü�� �����ǰ�, DriverManager�� ��ϵ�
			conn = DriverManager.getConnection(url, user, pwd);
			//DriverManager�� getConnection()�� ���Ͽ� Connection ��ü�� �����ϰ� �� �ּҰ��� �������� conn�� ������
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}