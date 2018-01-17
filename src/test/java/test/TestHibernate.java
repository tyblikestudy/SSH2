package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Student;
import service.StudentServerImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:application-dao.xml", "classpath:application-service.xml" })
public class TestHibernate {
	@Autowired
	private StudentServerImpl studentServerImpl;

	/**
	 * 查询学生表所有的数据
	 */
	@Test
	public void testQuery() {
		studentServerImpl.queryAll(null);
	}

	/**
	 * 添加学生信息
	 */
	@Test
	public void testSave() {
		studentServerImpl.save(new Student("李江", 29,"51078119950915","本人长的贼帅"));

	}

	/**
	 * 根据学生id删除学生
	 */
	@Test
	public void testDelete() {
		studentServerImpl.delete(new Student(1l));
	}

	/**
	 * 根据学生新对象有无id判断是插入还是修改
	 */
	@Test
	public void testSaveOrUpdate() {
		studentServerImpl.edit(new Student("李四", 20,"5107811996","长的贼稳"));
	}

	/**
	 * 根据学生id查询某行数据
	 */
	@Test
	public void testInfo() {
		 studentServerImpl.info(new Student(3l));
	}

}
