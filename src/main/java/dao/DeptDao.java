package dao;

import java.util.List;

import entity.Dept;

public interface DeptDao {

	public void save(Dept Dept);
	
	public void delete(Dept Dept);
	
	public void update(Dept Dept);
	
	public Dept findById(Short id);
	
	public List<Dept> findAll();
	
}
