package smart.dao;

import smart.model.Department;
import smart.model.PageBean;

import java.util.List;

public interface DepartmentDao {

	public List<Department> find(PageBean pageBean, Department s_department);
	
	public int count(Department s_department);
	
	public void add(Department department);
	
	public void update(Department department);
	
	public void delete(int id);
	
	public Department loadById(int id);
}
