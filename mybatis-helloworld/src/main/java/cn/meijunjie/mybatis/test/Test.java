package cn.meijunjie.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.meijunjie.mybatis.dao.EmployeeMapper;

public class Test {
		
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	
	public static void main(String[] args) throws IOException
	{
		//使用DefaultSQLSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
		logger.info("构建SQLSessionFactory成功 {}" + sessionFactory.toString());
		
		//默认使用DefaultSqlSession
		SqlSession session = sessionFactory.openSession();
		
		//employeeMapper	$Proxy0  (id=49)	
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class); //由JDK基于动态代理实现了EmployeeMapper接口的实现类
		
		System.out.println(employeeMapper.getEmployeeById(1));
		session.close();
		logger.info("成功关闭session");
	}
	
	
}
