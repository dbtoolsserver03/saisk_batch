package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.TeacherTable;

public interface TeacherTableMapper {
    int deleteByPrimaryKey(String teacherId);

    int insert(TeacherTable record);

    int insertSelective(TeacherTable record);

    TeacherTable selectByPrimaryKey(String teacherId);

    int updateByPrimaryKeySelective(TeacherTable record);

    int updateByPrimaryKey(TeacherTable record);
}