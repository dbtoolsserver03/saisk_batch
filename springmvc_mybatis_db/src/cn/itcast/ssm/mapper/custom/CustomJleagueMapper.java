package cn.itcast.ssm.mapper.custom;

import java.util.List;

import cn.itcast.ssm.po.original.Jleague;

public interface CustomJleagueMapper {

	List<Jleague> findJleagueList(Jleague jLeague);

}