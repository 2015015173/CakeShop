package com.chenlaoda.cake.cake.controller;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenlaoda.cake.cake.service.CakeServiceImpl;
import com.chenlaoda.cake.entity.Cake;

@Controller
@RequestMapping("/cake")
public class CakeController {

	private List<Cake> list = null;
	@Resource
	private SessionFactory sessionFactory;
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Resource
	private CakeServiceImpl cakeServiceImpl;
	public void loadAllCake(){
		

		return;
	}
	
}
