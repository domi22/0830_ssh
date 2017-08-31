package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import entity.Emp;
import service.EmpBiz;

public class EmpAction extends ActionSupport{

	private static final long serialVersionUID = -2264586692260525936L;
	private Emp emp;
	private EmpBiz empBiz;
	
	public String getEmpInfo() throws Exception{
		System.out.println("1233890");
		return SUCCESS;
	}
	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public EmpBiz getEmpBiz() {
		return empBiz;
	}
	public void setEmpBiz(EmpBiz empBiz) {
		this.empBiz = empBiz;
	}
	
}
