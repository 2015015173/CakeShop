package com.chenlaoda.cake.cake.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chenlaoda.cake.entity.Cake;

@Repository
public class CakeDaoImpl implements CakeDao{

	@Resource
	private JdbcTemplate jdbcTemplate;
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Cake> getAllCake(){
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from cake");
		return query.list();
	}
	
	
	
}
