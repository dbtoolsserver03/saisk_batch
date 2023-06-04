package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.CardTable;

public interface CardTableMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(CardTable record);

    int insertSelective(CardTable record);

    CardTable selectByPrimaryKey(String cardId);

    int updateByPrimaryKeySelective(CardTable record);

    int updateByPrimaryKey(CardTable record);
}