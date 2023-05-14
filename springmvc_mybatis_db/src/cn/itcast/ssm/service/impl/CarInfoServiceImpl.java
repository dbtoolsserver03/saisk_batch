package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.TCarinfoMapper;
import cn.itcast.ssm.po.original.TCarinfo;
import cn.itcast.ssm.service.CarInfoService;

public class CarInfoServiceImpl implements CarInfoService {

    @Autowired
    private TCarinfoMapper carInfoMapper;

	@Override
	public int inserTCarinfo(TCarinfo tCarinfo) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<TCarinfo> findTCarinfoList(TCarinfo tCarinfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int updateTCarinfo(TCarinfo tCarinfo) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public TCarinfo findTCarinfoByID(String tCarinfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int deleteItems(String[] tCarinfo) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}


}
