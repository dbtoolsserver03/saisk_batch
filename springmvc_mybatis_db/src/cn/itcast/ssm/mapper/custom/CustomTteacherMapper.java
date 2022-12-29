package cn.itcast.ssm.mapper.custom;

import java.util.List;

import cn.itcast.ssm.po.original.TeacherTable;

public interface CustomTteacherMapper {

	List<TeacherTable> findTeacherList(TeacherTable teacher);

}