package edu.ex.vo;

import org.apache.ibatis.annotations.Select;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeptVO {
	//연결할 오라클 파일과 이름 통일시킴
	private int deptno;// 부서번호
	private String dname;//부서이름
	private String loc;//지역
	
}
