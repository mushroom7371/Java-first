package DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBDao {
	Connection conn;
	//Connection Ÿ���� �������� conn �� ����
	
	public DBDao() {
		this.conn = new DBConn().getConn();
		//�����ڸ� ���Ͽ� Ŭ���� ������ ������ conn�� DBConnŬ������ ���� ��ü�� �����Ͽ� getConn()�޼��带 ȣ���� ���ϰ��� �����Ѵ�.
		//getConn()���� ���Ϲ��� ������ �����ͺ��̽��� ���ٰ����� ������ ����Ǿ��ְ� �̸����Ͽ� �����ͺ��̽��� �����Ѵ�.
	}
	
	public DBVo login(String mid, String pwd) {
		//public ���� �������� ��밡���� StudentVo Ÿ���� ���� ��ȯ�ϴ� login()�޼��带 �����ϰ�, �Ű������δ� String Ÿ���� mid, paw�� �޴´�
		DBVo vo = null;
		//�����ϱ� ���� StudentVo Ÿ���� �������� vo�� �����ϰ� �ʱⰪ�� null�� �����Ѵ�.
		PreparedStatement ps = null;
		//PreparedStatement Ÿ���� ���������� �����ϰ� null������ �ʱ�ȭ, PreparedStatement�� sql���� �����ϱ� ���� ����� ������.
		ResultSet rs = null;
		//executeQuery�� DB�� ����ϸ� �����͸� ResultSet ��ü�� �����ֱ⿡ �̸� �����ϱ����� ResultSetŸ���� ���������� �����Ͽ���. 
		String sql = "select * from hr.student where mid=? and pwd=? ";
		//sql ���� �����ϱ� ���� ��ɾ String Ÿ���� sql ������ ������
		try {	//���ܰ� �߻��� ���� ���� ����
			ps = conn.prepareStatement(sql);
			//conn�� prepareStatement()�޼��忡 sql ��ɾ ��� �غ���
			ps.setString(1, mid);
			ps.setString(2, pwd);
			//sql���� ù��° ?�� mid, �ι�° ?�� pwd�� �Է��Ͽ� �ش�.
			
			rs = ps.executeQuery();
			//ResultSet Ÿ���� �������� rs�� ps�� executeQuery()�޼��带 ������ ����� �����Ѵ�.
			//executeQuery()�� ���� sql ���� �����ͺ��̽��� ���޵Ǿ� �����ͺ��̽��� �̸� ���� �ϰ� ���� �����͸� ResultSet ��ü�� �����Ͽ� �ش�.
			if(rs.next()) {	//rs�� ���� �ִٸ�
				vo = new DBVo();
				//��������� ����� vo�� StudentVo() ��ü�� �����Ͽ� �ּҰ��� �����Ѵ�.
				vo.setMid(rs.getString("mid"));
				vo.setIrum(rs.getString("irum"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setEmail(rs.getString("email"));
				vo.setPwd(rs.getString("pwd"));
				vo.setGrade(rs.getInt("grade"));
				//�����ͺ��̽��� sql�� ���� ����� ���� �����Ͱ���� ������ ��ġ�� �����Ѵ�.
			}
		}catch(Exception ex) {
			ex.printStackTrace();	//���� �߻��� ���ܳ��� ���
		}
		return vo;	//���� �������� ����� �����͵��� �������� vo�� ����Ǿ� ��ȯ�ȴ�.
	}
}
