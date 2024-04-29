package edu.ex.mapper;

import org.apache.ibatis.annotations.Select;

import edu.ex.vo.EmpVO;

public interface TimeMapper {

	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	//public String getTime2();
	
	@Select("select * from emp where ename=#{ename}")
	EmpVO getEmp(String ename);
}
