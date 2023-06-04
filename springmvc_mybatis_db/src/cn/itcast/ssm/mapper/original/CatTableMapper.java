package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.CatTable;

public interface CatTableMapper {
    int deleteByPrimaryKey(String catId);

    int insert(CatTable record);

    int insertSelective(CatTable record);

    CatTable selectByPrimaryKey(String catId);

    int updateByPrimaryKeySelective(CatTable record);

    int updateByPrimaryKey(CatTable record);
}