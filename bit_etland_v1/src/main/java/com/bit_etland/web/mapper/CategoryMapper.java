package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryMapper {
	public void insertCategory(CategoryDTO cate);
	
	public List<CategoryDTO> selectAllCategoriesList(Proxy Pxy);
	public List<CategoryDTO> selectCategories(Proxy Pxy);
	public CategoryDTO selectCategory(Proxy Pxy);
	public int countCategory();
	public boolean existsCategory(Proxy Pxy);
	
	public void updateCategory(CategoryDTO cate);
	public void deleteCategory(CategoryDTO cate);
}
