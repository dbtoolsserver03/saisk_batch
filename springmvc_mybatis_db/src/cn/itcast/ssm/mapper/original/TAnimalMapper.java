package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.TAnimal;

public interface TAnimalMapper {
    int deleteByPrimaryKey(String id);

    int insert(TAnimal record);

    int insertSelective(TAnimal record);

    TAnimal selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TAnimal record);

    int updateByPrimaryKey(TAnimal record);
}