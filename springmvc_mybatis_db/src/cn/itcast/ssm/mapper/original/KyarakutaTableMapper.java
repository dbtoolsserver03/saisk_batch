package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.KyarakutaTable;

public interface KyarakutaTableMapper {
    int deleteByPrimaryKey(String kyarakutaId);

    int insert(KyarakutaTable record);

    int insertSelective(KyarakutaTable record);

    KyarakutaTable selectByPrimaryKey(String kyarakutaId);

    int updateByPrimaryKeySelective(KyarakutaTable record);

    int updateByPrimaryKey(KyarakutaTable record);
}