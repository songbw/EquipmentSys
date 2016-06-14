package smart.service.impl;

import smart.dao.UserDao;
import smart.model.PageBean;
import smart.model.User;
import smart.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public List<User> find(PageBean pageBean, User s_user) {
		return userDao.find(pageBean, s_user);
	}

	@Override
	public int count(User s_user) {
		return userDao.count(s_user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User loadById(int id) {
		return userDao.loadById(id);
	}

	@Override
	public boolean existUserByDeptId(int deptId) {
		return userDao.existUserByDeptId(deptId);
	}

}