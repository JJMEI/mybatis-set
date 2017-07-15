package cn.meijunjie.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.meijunjie.mybatis.bean.Employee;

public interface EmployeeMapper 
{
	//基于注解的，基于注解的能够解决一些简单的 SQL编写 可以和XML融合实现混合编程
	@Select("select id,last_name as lastName,email,gender from tab_employee where id = ${id}")
	public Employee getEmployeeById(@Param("id")int id);
}
