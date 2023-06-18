package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.custom.CustomTCardMapper;
import cn.itcast.ssm.mapper.custom.CustomTteacherMapper;
import cn.itcast.ssm.mapper.original.CardTableMapper;
import cn.itcast.ssm.mapper.original.TeacherTableMapper;
import cn.itcast.ssm.po.original.CardTable;
import cn.itcast.ssm.po.original.TeacherTable;
import cn.itcast.ssm.service.CardService;

/**
 *
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p>
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class CardServiceImpl implements CardService {

    @Autowired
    private CardTableMapper cardMapper;


    @Autowired
    private CustomTCardMapper customTCardMapper;


	@Override
	public int inserCard(CardTable card) throws Exception {
		int ret = cardMapper.insert(card);
		return ret;
	}

	@Override
	public List<CardTable> findCardList(CardTable card) {
		// TODO 自動生成されたメソッド・スタブ
		return customTCardMapper.findCardsList(card);
	}

	@Override
	public int updateCard(CardTable card) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public CardTable findCardByID(String cardId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int deleteItems(String[] cardIds) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
