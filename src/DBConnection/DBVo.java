package DBConnection;


public class DBVo {	//데이터 베이스로 부터 얻은 데이터를 저장하기위한 클래스
	String mid;	//보통 보안을 위해 private 제어자를 통하여 접근은 제한한다.
	String irum;
	String phone;
	String address;
	String email;
	String pwd;
	int grade;
	
	
	//데이터 값을 얻어오고, 저장하기 위한 getter, setter 메서드들
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
