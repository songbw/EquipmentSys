package smart.service;

import smart.model.PageBean;
import smart.model.Repair;

import java.util.List;

public interface RepairService {

	public List<Repair> find(PageBean pageBean, Repair s_repair);
	
	public int count(Repair s_repair);
	
}
