package com.chenlaoda.cake.user.dao;

import java.util.List;
import com.chenlaoda.cake.entity.User;
public interface UserDao {
	//ͨ��id��ȡuser����
    public User getUser(int id);
    
	//ͨ��name���������ҵ��û�����
	public User getUser(String nameOrEmail);
	
	//�����û�
	public void addUser(User user);    
	
	//ͨ��idɾ���û�
	public boolean deleteUser(int id);    
	
	//�޸��û���Ϣ
	public boolean updateUser(User user);   
	
	//�õ������û�����Ϣ
	public List<User> getAllUser();
}
