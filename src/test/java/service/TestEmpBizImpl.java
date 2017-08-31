package service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Emp;

public class TestEmpBizImpl {
	private static ApplicationContext ctx = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testFindEmpById() {
		EmpBiz empBiz = (EmpBiz)ctx.getBean("empBiz");
		Emp emp = empBiz.findEmpById(7934);
		System.out.println(emp);
	}

}
