package pack1;

public class Patient {
	
	int id;
	String pname;
	String phone;
	String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int extraMethod(int a) {
		return  a*a;
	}
	
	public String getPnameInCap() {
		return pname.toUpperCase();
	}
	

}
