package edu.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ex.mapper.DeptMapper;
import edu.ex.vo.DeptVO;

@Service
public class DeptServicelmpl implements DeptService{
	
	@Autowired
	private DeptMapper deptmapper;

	public List<DeptVO> getDetpList(){
		return deptmapper.getDetpList();
	}

	
}
