package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.TCarinfo;

public interface TCarinfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(TCarinfo record);

    int insertSelective(TCarinfo record);

    TCarinfo selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(TCarinfo record);

    int updateByPrimaryKey(TCarinfo record);
}