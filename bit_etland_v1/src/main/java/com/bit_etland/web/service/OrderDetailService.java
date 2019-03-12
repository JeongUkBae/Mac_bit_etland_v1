package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDetailDTO;
@Component
public interface OrderDetailService {
	public void registCustomer(OrderDetailDTO ordd);
	
	public List<OrderDetailDTO> bringAllOrderDetailsList();
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord);
	public OrderDetailDTO retrieveOrderDetail(String searchWord);
	public int countOrderDetail();
	public boolean existsOrderDetail(String searchWord);
	
	public void modifyOrderDetail(OrderDetailDTO ordd);
	public void removeOrderDetail(OrderDetailDTO ordd);
}
