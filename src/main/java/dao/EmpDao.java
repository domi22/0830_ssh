package dao;

import java.util.List;

import entity.Emp;

public interface EmpDao{
	
	/**
	 * 添加新员工
	 * @param emp
	 */
	public void save(Emp emp);
	
	public void delete(Emp emp);
	
	public void update(Emp emp);
	
	public Emp findById(Integer id);
	
	public List<Emp> findAll();
	
}
