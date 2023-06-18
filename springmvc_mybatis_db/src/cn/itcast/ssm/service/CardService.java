package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.CardTable;
public interface CardService {

	public int inserCard(CardTable card) throws Exception;

	public List<CardTable> findCardList(CardTable card);

	public int updateCard(CardTable card);

	public CardTable findCardByID(String cardId);

	public int deleteItems(String[] cardIds);

}
