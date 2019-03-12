package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.OrderDTO;
@Repository
public class OrderMapperImpl implements OrderMapper{

	@Override
	public void insertCustomer(OrderDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> selectAllOrdersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> selectOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO selectOrder(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsOrder(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateOrder(OrderDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(OrderDTO ordd) {
		// TODO Auto-generated method stub
		
	}

}
