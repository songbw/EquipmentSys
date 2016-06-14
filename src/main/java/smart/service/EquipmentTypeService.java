package smart.service;

import smart.model.EquipmentType;
import smart.model.PageBean;

import java.util.List;

public interface EquipmentTypeService {

	public List<EquipmentType> find(PageBean pageBean, EquipmentType s_equipmentType);
	
	public int count(EquipmentType s_equipmentType);
	
	public void add(EquipmentType equipmentType);
	
	public void update(EquipmentType equipmentType);
	
	public void delete(int id);
	
	public EquipmentType loadById(int id);
}
