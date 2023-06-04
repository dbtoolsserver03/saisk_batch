package cn.itcast.ssm.po.original;

import java.math.BigDecimal;
import java.util.Date;

public class PersonTable {
    private String personId;

    private String personName;

    private String personSex;

    private Date personAge;

    private BigDecimal personSalary;

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

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public Date getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Date personAge) {
        this.personAge = personAge;
    }

    public BigDecimal getPersonSalary() {
        return personSalary;
    }

    public void setPersonSalary(BigDecimal personSalary) {
        this.personSalary = personSalary;
    }
}