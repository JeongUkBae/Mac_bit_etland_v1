package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public void registCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> bringAllCategoriesList(Proxy Pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> retrieveCategories(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO retrieveCategory(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsCategory(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

}
