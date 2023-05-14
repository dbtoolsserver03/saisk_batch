package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.original.CustomersMapper;
import cn.itcast.ssm.po.original.Customers;
import cn.itcast.ssm.service.CustomersService;

public class CustomersServiceImpl implements CustomersService {

    @Autowired
    private CustomersMapper customersMapper;
//    @Autowired
//  private CustomCustomersMapper customCustomersMapper;

	@Override
	public int inserCustomers(Customers Customers) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public List<Customers> findCustomersList(Customers Customers) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int updateCustomers(Customers Customers) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public Customers findCustomersByID(String CustomersId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int deleteItems(String[] CustomersIds) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}



}
