package cn.itcast.ssm.mapper.custom;

import java.util.List;

import cn.itcast.ssm.po.original.KyarakutaTable;

public interface CustomkyarakutaMapper {

	List<KyarakutaTable> findkyarakutaList(KyarakutaTable kyarakuta);

}