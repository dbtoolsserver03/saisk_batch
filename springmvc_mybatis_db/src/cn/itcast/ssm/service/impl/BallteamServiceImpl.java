package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.BallteamMapper;
import cn.itcast.ssm.po.original.Ballteam;
import cn.itcast.ssm.service.BallteamService;

public class BallteamServiceImpl implements BallteamService {

    @Autowired
    private BallteamMapper ballteamMapper;
    
    @Override
    public int inserballteam(Ballteam ballteam) throws Exception {
        return ballteamMapper.insertSelective(ballteam);
    }



}