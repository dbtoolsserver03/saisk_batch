package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.TCarinfo;

public interface CarInfoService {

	public int inserTCarinfo(TCarinfo tCarinfo) throws Exception;

	public List<TCarinfo> findTCarinfoList(TCarinfo tCarinfo);

	public int updateTCarinfo(TCarinfo tCarinfo);

	public TCarinfo findTCarinfoByID(String tCarinfo);

	public int deleteItems(String[] tCarinfo);



}
