package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.OrderDetailDTO;
@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Override
	public void registCustomer(OrderDetailDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> bringAllOrderDetailsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrderDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO ordd) {
		// TODO Auto-generated method stub
		
	}

}
