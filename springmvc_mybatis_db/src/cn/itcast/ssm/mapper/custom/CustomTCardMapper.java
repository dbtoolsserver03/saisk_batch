package cn.itcast.ssm.mapper.custom;

import java.util.List;

import cn.itcast.ssm.po.original.CardTable;

public interface CustomTCardMapper {

	List<CardTable> findCardsList(CardTable card);

}