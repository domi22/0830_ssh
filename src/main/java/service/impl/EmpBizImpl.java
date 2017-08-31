package service.impl;

import dao.EmpDao;
import entity.Emp;
import service.EmpBiz;

public class EmpBizImpl implements EmpBiz {
	private EmpDao empDao;

	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public Emp findEmpById(Integer id) {
		return empDao.findById(id);
	}

}
