package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.Customers;

public interface CustomersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Customers record);

    int insertSelective(Customers record);

    Customers selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKey(Customers record);
}