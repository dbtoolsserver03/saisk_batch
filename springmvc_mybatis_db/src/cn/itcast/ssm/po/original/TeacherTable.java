package cn.itcast.ssm.po.original;

import java.util.Date;

public class TeacherTable {
    private String teacherId;

    private String teacherName;

    private String teacherSex;

    private Date teacherAge;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Date getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Date teacherAge) {
        this.teacherAge = teacherAge;
    }
}