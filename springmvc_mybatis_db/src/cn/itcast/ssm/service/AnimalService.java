package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.TAnimal;

public interface AnimalService {

	public int inserAnimal(TAnimal animal) throws Exception;
//
//	public List<TeacherTable> findTeacherList(TeacherTable teacher);
//
//	public int updateTeacher(TeacherTable teacher);
//
//	public TeacherTable findTeacherByID(String teacherId);
//
//	public int deleteItems(String[] teacherIds);

	public List<TAnimal> findAnimalList(TAnimal animal);

}
