package com.chenlaoda.cake.user.dao;

import java.util.List;
import com.chenlaoda.cake.entity.User;
public interface UserDao {
	//通过id获取user对象
    public User getUser(int id);
    
	//通过name或者邮箱找到用户对象
	public User getUser(String nameOrEmail);
	
	//增加用户
	public void addUser(User user);    
	
	//通过id删除用户
	public boolean deleteUser(int id);    
	
	//修改用户信息
	public boolean updateUser(User user);   
	
	//得到所有用户的信息
	public List<User> getAllUser();
}
