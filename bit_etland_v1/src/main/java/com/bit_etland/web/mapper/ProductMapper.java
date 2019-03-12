package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.ProductDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface ProductMapper {
	public void insertproduct(ProductDTO pro);
	
	public List<ProductDTO> selectProductsList(Proxy pxy);
	public List<ProductDTO> selectProducts(Proxy pxy);
	public ProductDTO selectProduct(ProductDTO pro);
	public int countProduct(Proxy pxy);
	public boolean existsProductID(ProductDTO pro);
	public void updateProduct(ProductDTO pro);
	public Map<String, Object> selectProfile(Proxy pxy);
	public void deleteProduct(ProductDTO pro);
	public Map<String, Object> selectPhone(Proxy pxy);
}
