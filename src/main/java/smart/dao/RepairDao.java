package smart.dao;

import smart.model.PageBean;
import smart.model.Repair;

import java.util.List;

public interface RepairDao {

	public void add(Repair repair);
	
	public List<Repair> find(PageBean pageBean, Repair s_repair);
	
	public int count(Repair s_repair);
	
	public void update(Repair repair);
}
