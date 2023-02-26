package cn.itcast.ssm.mapper.custom;

import java.util.List;

import cn.itcast.ssm.po.original.TAnimal;

public interface CustomTAnimalMapper {

	List<TAnimal> findAnimalList(TAnimal animal);

}