package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.BloodTableMapper;
import cn.itcast.ssm.po.original.BloodTable;
import cn.itcast.ssm.service.SaiBloodService;

public class SaiBloodServiceImpl implements SaiBloodService {

    @Autowired
    private BloodTableMapper mapper;

    @Override
    public int inserSaiBlood(BloodTable blood) throws Exception {
        return mapper.insertSelective(blood);
    }


}
