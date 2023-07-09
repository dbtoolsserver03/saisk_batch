package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.BloodTable;

public interface BloodTableMapper {
    int deleteByPrimaryKey(String personId);

    int insert(BloodTable record);

    int insertSelective(BloodTable record);

    BloodTable selectByPrimaryKey(String personId);

    int updateByPrimaryKeySelective(BloodTable record);

    int updateByPrimaryKey(BloodTable record);
}