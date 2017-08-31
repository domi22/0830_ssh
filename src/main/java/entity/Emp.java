package entity;

public class Emp {
	
	private Integer empNo;		//雇员的编号，对应数据库中的EMPNO列
	private String empName;		//雇员的姓名，对应数据库中的ENAME列
	private String job;			//雇员的职位，对应数据库中的JOB列
	private Integer mgrNo; 		//雇员对应的领导编号，领导也是雇员，对应数据库中的MGR列
	private String hireDate;	//雇员的雇佣日期，对应数据库中的HIREDATE列
	private Double salary;		//基本工资，对应数据库中的SAL列
	private Double commission;	//奖金，佣金，对应数据库中的COMM列
	private Integer deptNo;		//雇员所在的部门编号，对应数据库中的DEPTNO列
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", mgrNo=" + mgrNo + ", hireDate="
				+ hireDate + ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}
	
}
