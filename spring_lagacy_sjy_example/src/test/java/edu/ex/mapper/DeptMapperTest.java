package edu.ex.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.ex.vo.DeptVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DeptMapperTest {

   @Autowired
   private DeptMapper deptMapper;
   
   @Test
   public void testDeptMapper() {
      assertNotNull(deptMapper);
      
      for (DeptVO vo : deptMapper.getDetpList()) {
            System.out.println(vo);
      }
   }

}