package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomJleagueMapper;
import cn.itcast.ssm.mapper.original.JleagueMapper;
import cn.itcast.ssm.po.original.Jleague;
import cn.itcast.ssm.service.JleagueService;

public class JleagueServiceImpl implements JleagueService {

    @Autowired
    private JleagueMapper jleagueMapper;
	@Autowired
	private CustomJleagueMapper customJleagueMapper;

	@Override
	public int inserJleague(Jleague jLeague) throws Exception {
		
		return jleagueMapper.insertSelective(jLeague);
	}

	@Override
	public List<Jleague> findJleagueList(Jleague jLeague) {
		return customJleagueMapper.findJleagueList(jLeague);
	}

	@Override
	public int updateJleague(Jleague jLeague) {
		return jleagueMapper.updateByPrimaryKeySelective(jLeague);
	}

	@Override
	public Jleague findJleagueByID(String id) {
		return jleagueMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public int deleteItems(String[] jLeague) {
		
		int cnt=0;
		
		for (String id : jLeague) {
			cnt += jleagueMapper.deleteByPrimaryKey(Integer.valueOf(id));
		}
		
		return cnt;
	}

  

}
