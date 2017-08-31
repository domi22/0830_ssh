package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.DeptDao;
import entity.Dept;

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {

	@Override
	public void save(Dept dept) {
		this.getHibernateTemplate().save(dept);
	}

	@Override
	public void delete(Dept dept) {
		this.getHibernateTemplate().delete(dept);
	}

	@Override
	public void update(Dept dept) {
		this.getHibernateTemplate().update(dept);
	}

	@Override
	public Dept findById(Short id) {
		return this.getHibernateTemplate().get(Dept.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> findAll() {
		return (List<Dept>)(Object)this.getHibernateTemplate().find("from Dept");
	}

}
