package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomTAnimalMapper;
import cn.itcast.ssm.mapper.original.TAnimalMapper;
import cn.itcast.ssm.po.original.TAnimal;
import cn.itcast.ssm.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private TAnimalMapper animalMapper;
    
    @Autowired
    private CustomTAnimalMapper customTAnimalMapper;
    
    @Override
    public int inserAnimal(TAnimal animal) throws Exception {
        return animalMapper.insertSelective(animal);
    }

	@Override
	public List<TAnimal> findAnimalList(TAnimal animal) {
		return customTAnimalMapper.findAnimalList(animal);
	}


}
