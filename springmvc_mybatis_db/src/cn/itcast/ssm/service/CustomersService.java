package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.original.Customers;

public interface CustomersService {

	public int inserCustomers(Customers Customers) throws Exception;

	public List<Customers> findCustomersList(Customers Customers);

	public int updateCustomers(Customers Customers);

	public Customers findCustomersByID(String CustomersId);

	public int deleteItems(String[] CustomersIds);

}
