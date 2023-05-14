package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.JleagueMapper;
import cn.itcast.ssm.po.original.Jleague;
import cn.itcast.ssm.service.JleagueService;

public class JleagueServiceImpl implements JleagueService {

    @Autowired
    private JleagueMapper jleagueMapper;
//    @Autowired
//  private CustomJleagueMapper jleagueMapper;

	@Override
	public int inserJleague(Jleague jLeague) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<Jleague> findJleagueList(Jleague jLeague) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int updateJleague(Jleague jLeague) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Jleague findJleagueByID(String jLeague) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int deleteItems(String[] jLeague) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

  

}
