package com.revature.model;

public class Employeedo {

	private int userId;
	private String name;
	private String password;
	private String email;
	private String department;
	private String employeeType;
	
	

	public Employeedo() {
	}

	
	


	public Employeedo(int userId, String name, String email, String department, String employeeType) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.department = department;
		this.employeeType = employeeType;
	}





	public Employeedo(int userId, String name, String password, String email, String department, String employeeType) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.department = department;
		this.employeeType = employeeType;
	}





	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getEmployeeType() {
		return employeeType;
	}



	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employeeType == null) ? 0 : employeeType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeedo other = (Employeedo) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employeeType == null) {
			if (other.employeeType != null)
				return false;
		} else if (!employeeType.equals(other.employeeType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Employeedo [userId=" + userId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", department=" + department + ", employeeType=" + employeeType + "]";
	}





	public Object getAllTodos_id() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

	

	
}
