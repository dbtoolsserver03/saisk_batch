package cn.itcast.ssm.mapper.original;

import cn.itcast.ssm.po.original.Ballteam;

public interface BallteamMapper {
    int deleteByPrimaryKey(String id);

    int insert(Ballteam record);

    int insertSelective(Ballteam record);

    Ballteam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Ballteam record);

    int updateByPrimaryKeyWithBLOBs(Ballteam record);

    int updateByPrimaryKey(Ballteam record);
}