package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.TeacherTable;

/**
 *
 * <p>Title: ItemsService</p>
 * <p>Description:商品管理service </p>
 * <p>Company: www.itcast.com</p>
 * @author	传智.燕青
 * @date	2015-4-13下午3:48:09
 * @version 1.0
 */
public interface TeacherService {

	public int inserTeacher(TeacherTable teacher) throws Exception;

	public List<TeacherTable> findTeacherList(TeacherTable teacher);

	public int updateTeacher(TeacherTable teacher);

	public TeacherTable findTeacherByID(String teacherId);

	public int deleteItems(String[] teacherIds);

}
