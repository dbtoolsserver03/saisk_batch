package cn.itcast.ssm.po.original;

import java.math.BigDecimal;
import java.util.Date;

public class CardTable {
    private String cardId;

    private String cardName;

    private String cardZhongzu;

    private Date cardShuxing;

    private BigDecimal cardAttack;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardZhongzu() {
        return cardZhongzu;
    }

    public void setCardZhongzu(String cardZhongzu) {
        this.cardZhongzu = cardZhongzu;
    }

    public Date getCardShuxing() {
        return cardShuxing;
    }

    public void setCardShuxing(Date cardShuxing) {
        this.cardShuxing = cardShuxing;
    }

    public BigDecimal getCardAttack() {
        return cardAttack;
    }

    public void setCardAttack(BigDecimal cardAttack) {
        this.cardAttack = cardAttack;
    }
}