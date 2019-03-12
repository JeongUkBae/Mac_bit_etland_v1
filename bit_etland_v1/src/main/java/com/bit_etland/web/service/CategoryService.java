package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Component
public interface CategoryService {
	public void registCategory(CategoryDTO cat);
	
	public List<CategoryDTO> bringAllCategoriesList(Proxy Pxy);
	public List<CategoryDTO> retrieveCategories(String searchWord);
	public CategoryDTO retrieveCategory(String searchWord);
	public int countCategory();
	public boolean existsCategory(String searchWord);
	
	public void modifyCategory(CategoryDTO cat);
	public void removeCategory(CategoryDTO cat);
}
