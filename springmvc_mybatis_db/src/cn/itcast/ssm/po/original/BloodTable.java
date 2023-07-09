package cn.itcast.ssm.po.original;

import java.math.BigDecimal;
import java.util.Date;

public class BloodTable {
    private String personId;

    private String personName;

    private String gender;

    private Date age;

    private BigDecimal bloodCc;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public BigDecimal getBloodCc() {
        return bloodCc;
    }

    public void setBloodCc(BigDecimal bloodCc) {
        this.bloodCc = bloodCc;
    }
}