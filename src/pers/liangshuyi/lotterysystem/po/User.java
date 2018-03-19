package pers.liangshuyi.lotterysystem.po;

public class User {
    private String userid;

    private String username;

    private String password;

    private String name;

    private Integer dender;

	private Integer age;

    private String address;

	private String email;

    private Integer status;

    private String misleadpwd;

    private Integer phone;

    private Integer role;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDender() {
		return dender;
	}

	public void setDender(Integer dender) {
		this.dender = dender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMisleadpwd() {
		return misleadpwd;
	}

	public void setMisleadpwd(String misleadpwd) {
		this.misleadpwd = misleadpwd;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
}