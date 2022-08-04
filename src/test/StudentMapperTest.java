package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.beans.Student;
import com.mapper.StudentMapper;

class StudentMapperTest {
	
	private SqlSessionFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
		factory=new SqlSessionFactoryBuilder().build(in);
	}

	@Test
	void testAddStudent() {
		SqlSession session=factory.openSession();
		StudentMapper stuMapper=session.getMapper(StudentMapper.class);
		
		Student stu=new Student();
		stu.setStuName("小二");
		stu.setAge(14);
		stu.setGender('男');
		stu.setSchoolId(2);
		stu.setRoomId(1);
		int result=stuMapper.addStudent(stu);
	
		System.out.println("自增主键"+stu.getStuId());
		stuMapper.addStudentRoom(stu);
		System.out.println(result==1?"添加成功":"添加失败");
		session.commit();
		session.close();
	}

	@Test
	void testUpdateStudent() {
		SqlSession session=factory.openSession();
		StudentMapper stuMapper=session.getMapper(StudentMapper.class);
		
		Student stu=stuMapper.getStuById(15);
		stu.setStuName("吴琳");
		stu.setGender('男');
		stu.setEndAge(10);
		System.out.println(stuMapper.updateStudent(stu)==1?"更新成功":"更新失败");
		session.commit();
		session.close();
	}

	@Test
	void testGetStudentList() {
		SqlSession session=factory.openSession();
		StudentMapper stuMapper=session.getMapper(StudentMapper.class);
		
		Student stu=new Student();
		stu.setStuName("小");
		stu.setGender(' ');
		stu.setStartAge(15);
		stu.setEndAge(null);
		List<Student> stuList=stuMapper.getStudentList(stu);
		stuList.forEach(v->System.out.println(v));
		session.close();
	}

	@Test
	void testGetStudentCount() {
		SqlSession session=factory.openSession();
		StudentMapper stuMapper=session.getMapper(StudentMapper.class);
		
		Student stu=new Student();
		stu.setStuName("小");
		stu.setGender(' ');
		stu.setStartAge(15);
		stu.setEndAge(null);
		int count=stuMapper.getStudentCount(stu);
		System.out.println("数量为"+count);
		session.close();
	}

}
