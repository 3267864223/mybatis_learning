package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.beans.Student;

public interface StudentMapper {

	@Insert("insert into student (stuName,age,gender,schoolId,roomId) values(#{stuName},#{age},#{gender},#{schoolId},#{roomId})")
	@Options(useGeneratedKeys = true,keyColumn = "stuId",keyProperty = "stuId")
	int addStudent(Student stu);
	
	@Insert("insert into studentroom (stuId,roomId) values(#{stuId},#{roomId})")
	int addStudentRoom(Student stu);
	
	int updateStudent(Student stu);
	
	List<Student> getStudentList(Student stu);
	
	int getStudentCount(Student stu);

	Student getStuById(int i);
}
