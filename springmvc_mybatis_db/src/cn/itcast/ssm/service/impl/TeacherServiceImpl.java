package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomTteacherMapper;
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
    @Autowired
    private CustomTteacherMapper customTteacherMapper;
    
    @Override
    public int inserTeacher(TeacherTable teacher) throws Exception {
        return teacherMapper.insertSelective(teacher);
    }

	@Override
	public List<TeacherTable> findTeacherList(TeacherTable teacher) {
		return customTteacherMapper.findTeacherList(teacher);
	}

	@Override
	public int updateTeacher(TeacherTable teacher) {
        return teacherMapper.updateByPrimaryKeySelective(teacher);
		
	}

	@Override
	public TeacherTable findTeacherByID(String teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
	}

	@Override
	public int deleteItems(String[] teacherIds) {
		int cnt=0;
		for (String str : teacherIds) {
			cnt+= teacherMapper.deleteByPrimaryKey(str);
		}
		return cnt;
	}

}
