package com.chenlaoda.cake.cake.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.chenlaoda.cake.cake.dao.CakeDaoImpl;
import com.chenlaoda.cake.entity.Cake;

@Service
public class CakeServiceImpl implements CakeService{

	private List<Cake> list = null;

	@Resource
	private CakeDaoImpl cakeDaoImpl;
	
	@Autowired  
	private HttpSession session;  
	
	public void loadAllCake(){
		list = cakeDaoImpl.getAllCake();
		int count = list.size();
		session.setAttribute("count", count);
		session.setAttribute("allCakeList", list);
		session.setAttribute("pageIndex", 1);
		return;
	}
	
	
}
