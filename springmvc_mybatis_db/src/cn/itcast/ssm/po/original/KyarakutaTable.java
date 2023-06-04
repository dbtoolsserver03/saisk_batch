package cn.itcast.ssm.po.original;

import java.math.BigDecimal;
import java.util.Date;

public class KyarakutaTable {
    private String kyarakutaId;

    private String kyarakutaName;

    private String kyarakutaSex;

    private Date kyarakutaAge;

    private BigDecimal kyarakutaSalary;

    public String getKyarakutaId() {
        return kyarakutaId;
    }

    public void setKyarakutaId(String kyarakutaId) {
        this.kyarakutaId = kyarakutaId;
    }

    public String getKyarakutaName() {
        return kyarakutaName;
    }

    public void setKyarakutaName(String kyarakutaName) {
        this.kyarakutaName = kyarakutaName;
    }

    public String getKyarakutaSex() {
        return kyarakutaSex;
    }

    public void setKyarakutaSex(String kyarakutaSex) {
        this.kyarakutaSex = kyarakutaSex;
    }

    public Date getKyarakutaAge() {
        return kyarakutaAge;
    }

    public void setKyarakutaAge(Date kyarakutaAge) {
        this.kyarakutaAge = kyarakutaAge;
    }

    public BigDecimal getKyarakutaSalary() {
        return kyarakutaSalary;
    }

    public void setKyarakutaSalary(BigDecimal kyarakutaSalary) {
        this.kyarakutaSalary = kyarakutaSalary;
    }
}