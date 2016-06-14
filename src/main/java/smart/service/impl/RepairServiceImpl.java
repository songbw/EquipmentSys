package smart.service.impl;

import smart.dao.RepairDao;
import smart.model.PageBean;
import smart.model.Repair;
import smart.service.RepairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("repairService")
public class RepairServiceImpl implements RepairService{

	@Resource
	private RepairDao repairDao;
	
	
	@Override
	public List<Repair> find(PageBean pageBean, Repair s_repair) {
		return repairDao.find(pageBean, s_repair);
	}

	@Override
	public int count(Repair s_repair) {
		return repairDao.count(s_repair);
	}




}
