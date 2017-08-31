package entity;

import java.io.Serializable;

public class Dept implements Serializable {

	private static final long serialVersionUID = 2011659024203565603L;
	private Short deptNo;
	private String deptName;
	private String location;
	
	public Dept(){
		super();
	}

	public Short getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Short deptNo) {
		this.deptNo = deptNo;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
}
