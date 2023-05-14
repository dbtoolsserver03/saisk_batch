package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.Jleague;

public interface JleagueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jleague record);

    int insertSelective(Jleague record);

    Jleague selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jleague record);

    int updateByPrimaryKey(Jleague record);
}