package entity;

public class Emp {
	
	private Integer empNo;		//��Ա�ı�ţ���Ӧ���ݿ��е�EMPNO��
	private String empName;		//��Ա����������Ӧ���ݿ��е�ENAME��
	private String job;			//��Ա��ְλ����Ӧ���ݿ��е�JOB��
	private Integer mgrNo; 		//��Ա��Ӧ���쵼��ţ��쵼Ҳ�ǹ�Ա����Ӧ���ݿ��е�MGR��
	private String hireDate;	//��Ա�Ĺ�Ӷ���ڣ���Ӧ���ݿ��е�HIREDATE��
	private Double salary;		//�������ʣ���Ӧ���ݿ��е�SAL��
	private Double commission;	//����Ӷ�𣬶�Ӧ���ݿ��е�COMM��
	private Integer deptNo;		//��Ա���ڵĲ��ű�ţ���Ӧ���ݿ��е�DEPTNO��
	
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
