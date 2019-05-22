package com.atguigu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.mybatis.bean.Employee;


public class MyBatisTest {
	
	/**
	 * 1. 根据xml配置，创建一个sqlSessionFactory
	 * @throws IOException 
	 * 
	 * 
	 */
	
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException
	{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	@Test
	public void test() throws IOException
	{
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		//2.获取SqlSession
		//传入一个唯一标识
		SqlSession session = sqlSessionFactory.openSession();
		try {
		Employee employee = session.selectOne("com.atguigu.mybatis.EmployeeMapper.selectEmp", 1);
		System.out.println(employee);
		} finally {
		session.close();
		}
	}
	
	@Test
	public void test01() throws IOException
	{
		//1 获取SqlSessionFactory
		
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
		Employee employee = mapper.getEmpById(1);
		System.out.println("employee="+employee);
	}

}
