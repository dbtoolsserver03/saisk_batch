package cn.itcast.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.TAnimalMapper;
import cn.itcast.ssm.po.original.TAnimal;
import cn.itcast.ssm.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private TAnimalMapper animalMapper;
    
    @Override
    public int inserAnimal(TAnimal animal) throws Exception {
        return animalMapper.insertSelective(animal);
    }


}
