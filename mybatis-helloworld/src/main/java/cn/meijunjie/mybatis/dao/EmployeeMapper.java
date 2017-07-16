package cn.meijunjie.mybatis.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.meijunjie.mybatis.bean.Employee;

public interface EmployeeMapper 
{
	//基于注解的，基于注解的能够解决一些简单的 SQL编写 可以和XML融合实现混合编程
	//@Select("select id,last_name,email,gender from tab_employee where id = ${id}")
	//mybatis 传入单个参数的时候 不会做多个处理，但是如果传入多个参数的时候，必须加上注解 否则会出错
	public Employee getEmployeeById(@Param("id")int id,@Param("name")String name);
	
	//@Insert("insert into tab_employee(last_name,email,gender) values(#{last_name},#{email},#{gender})")
	public void addEmployee(Employee employee);
	
//	@Update("update tab_employee set last_name=")
public void updateEmployee(Employee employee);
	
//	@Delete("delete tab_employee where id=#{id}")
//	public void deleteEmployee(@Param("id") int id);
}
