package cn.itcast.ssm.po.original;

import java.math.BigDecimal;
import java.util.Date;

public class CatTable {
    private String catId;

    private String catName;

    private String catSex;

    private Date catAge;

    private BigDecimal catWeight;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatSex() {
        return catSex;
    }

    public void setCatSex(String catSex) {
        this.catSex = catSex;
    }

    public Date getCatAge() {
        return catAge;
    }

    public void setCatAge(Date catAge) {
        this.catAge = catAge;
    }

    public BigDecimal getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(BigDecimal catWeight) {
        this.catWeight = catWeight;
    }
}