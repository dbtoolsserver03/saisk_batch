package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.TeacherTableMapper;
import cn.itcast.ssm.po.original.TeacherTable;
import cn.itcast.ssm.service.TeacherService;

/**
 *
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p>
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherTableMapper teacherMapper;

    @Override
    public int inserTeacher(TeacherTable teacher) throws Exception {
        return teacherMapper.insertSelective(teacher);
    }

}
