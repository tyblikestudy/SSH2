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
	 * ��ѯѧ�������е�����
	 */
	@Test
	public void testQuery() {
		studentServerImpl.queryAll(null);
	}

	/**
	 * ���ѧ����Ϣ
	 */
	@Test
	public void testSave() {
		studentServerImpl.save(new Student("�", 29,"51078119950915","���˳�����˧"));

	}

	/**
	 * ����ѧ��idɾ��ѧ��
	 */
	@Test
	public void testDelete() {
		studentServerImpl.delete(new Student(1l));
	}

	/**
	 * ����ѧ���¶�������id�ж��ǲ��뻹���޸�
	 */
	@Test
	public void testSaveOrUpdate() {
		studentServerImpl.edit(new Student("����", 20,"5107811996","��������"));
	}

	/**
	 * ����ѧ��id��ѯĳ������
	 */
	@Test
	public void testInfo() {
		 studentServerImpl.info(new Student(3l));
	}

}
