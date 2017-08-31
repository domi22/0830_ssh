package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.EmpDao;
import entity.Emp;

public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@Override
	public void save(Emp emp) {
		this.getHibernateTemplate().save(emp);
	}

	@Override
	public void delete(Emp emp) {
		this.getHibernateTemplate().delete(emp);
	}

	@Override
	public void update(Emp emp) {
		this.getHibernateTemplate().update(emp);
	}

	@Override
	public Emp findById(Integer id) {
		return this.getHibernateTemplate().get(Emp.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emp> findAll() {
		return (List<Emp>)(Object)this.getHibernateTemplate().find("from Emp");
	}

}
