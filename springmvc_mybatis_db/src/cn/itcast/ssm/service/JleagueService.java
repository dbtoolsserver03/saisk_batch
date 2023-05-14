package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.Jleague;

public interface JleagueService {

	public int inserJleague(Jleague jLeague) throws Exception;

	public List<Jleague> findJleagueList(Jleague jLeague);

	public int updateJleague(Jleague jLeague);

	public Jleague findJleagueByID(String jLeague);

	public int deleteItems(String[] jLeague);

}
