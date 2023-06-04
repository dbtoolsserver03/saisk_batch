package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.PersonTable;

public interface PersonTableMapper {
    int deleteByPrimaryKey(String personId);

    int insert(PersonTable record);

    int insertSelective(PersonTable record);

    PersonTable selectByPrimaryKey(String personId);

    int updateByPrimaryKeySelective(PersonTable record);

    int updateByPrimaryKey(PersonTable record);
}